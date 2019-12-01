package com.demo.truyenfull.crawler.controller;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.thrift.TException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.demo.truyenfull.crawler.model.Category;
import com.demo.truyenfull.crawler.model.Chapter;
import com.demo.truyenfull.crawler.model.Comic;
import com.demo.truyenfull.crawler.repository.CategoryRepository;
import com.demo.truyenfull.crawler.repository.ChapterRepository;
import com.demo.truyenfull.crawler.repository.ComicRepository;
import com.demo.truyenfull.lib.TCrawlerService;

@Controller
public class CrawlerController implements TCrawlerService.Iface {

	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	ComicRepository commicRepository;
	@Autowired
	ChapterRepository chapterRepository;

	public Set<Category> getListCategory() throws IOException {
		Set<Category> categories = categoryRepository.findAll().stream().collect(Collectors.toSet());

		Document document = Jsoup.connect("https://truyenfull.vn/").get();
		Elements elements = document.select("div.row > div.col-md-4 > ul > li > a");
		for (Element element : elements) {
			Category newCategory = new Category();
			String[] temp = (element.attr("href").split("/"));
			String name = element.text();
			String urlName = temp[temp.length - 1];
			newCategory.setName(name);
			newCategory.setLink(urlName);
			categories.add(newCategory);
		}

		categoryRepository.saveAll(categories);
		return categories;
	}

	public void crawlChapterOfCommic(String commicUrl, Comic commic) throws IOException {
		List<Chapter> chapters = chapterRepository.findAll();
		boolean hasNext = false;
		do {
			Document document = Jsoup.connect(commicUrl).get();
			Elements elements = document.select("#list-chapter > div.row > div > ul > li > a");
			for (Element element : elements) {
				Document docChapterDetail = Jsoup.connect(element.attr("href")).get();
				Element content = docChapterDetail.select("#chapter-c").first();

				Chapter chapterModel = new Chapter();
				chapterModel.setTitle(element.attr("title"));
				chapterModel.setContent(content.text());
				chapterModel.setLink(element.attr("href"));
				chapterModel.setComic(commic);
				if (chapterRepository.findByTitle(element.attr("title")) == null) {
					chapters.add(chapterModel);
				}
			}

			chapterRepository.saveAll(chapters);

			Element nextPageButton = document.select("#list-chapter > ul > li.active + li > a").first();
			commicUrl = nextPageButton != null ? nextPageButton.attr("href") : "javascript:void(0)";
			if (!commicUrl.equals("javascript:void(0)")) {
				hasNext = true;
				commicUrl = nextPageButton.attr("href");
				// System.out.println("Chapter link:" + commicUrl);
			} else {
				hasNext = false;
			}
		} while (hasNext);
	}

	// Crawler Comic
	@Override
	public String crawler() throws IOException, TException {
		// TODO Auto-generated method stub
		Set<Category> categories;
		if (categoryRepository.findAll().isEmpty()) {
			categories = getListCategory();
		} else {
			categories = categoryRepository.findAll().stream().collect(Collectors.toSet());
		}
		int pageComic = Integer.parseInt(Jsoup.connect("https://truyenfull.vn/danh-sach/truyen-hot/").get()
				.select("div.container.text-center.pagination-container > div > ul > li:nth-child(8) > a").first()
				.attr("title").replaceAll("[^0-9?!\\.]", ""));
		// System.out.println(pageComic);
		for (int i = 1; i < 2; i++) {
			System.out.println("Page: " + i);
			Document document = Jsoup.connect("https://truyenfull.vn/danh-sach/truyen-full/trang-" + i + "/")
					.userAgent("Mozilla").get();
			Elements elements = document.select(
					"#list-page > div.col-xs-12.col-sm-12.col-md-9.col-truyen-main > div.list.list-truyen.col-xs-12 > div.row");
			for (Element element : elements) {
				Document docStoryDetail = Jsoup.connect(element.select("h3.truyen-title > a").attr("href")).get();
				Elements categoriesStory = docStoryDetail.select("div:nth-child(2) > a");

				String title = element.select("h3.truyen-title > a").text();
				String description = docStoryDetail.select("div.col-xs-12.col-sm-8.col-md-8.desc > div.desc-text")
						.first().text();
				String author = element.select("span.author").text();
				String authorCode = java.text.Normalizer.normalize(author, java.text.Normalizer.Form.NFD)
						.replaceAll("\\p{InCombiningDiacriticalMarks}+", "").replaceAll(" ", "-").toLowerCase().trim();
				String thumbnail = element.select("div.col-xs-3 > div > div.lazyimg").attr("data-image");
				String status = docStoryDetail.select("div.info > div > span").last().text();
				String numberOfChapter = element.select("div.col-xs-2 > div > a").text();
				Long views = Long.parseLong(docStoryDetail.select("span[property='v:count']").first().text());
				double rating = Double.parseDouble(docStoryDetail.select("span[property='v:average']").first().text());
				// Crawl commic again when chapter new

				if (commicRepository.findByTitle(title) == null) {
					System.out.println("Comic chưa có trong db !");
					Comic comicModel = new Comic();
					comicModel.setTitle(title);
					comicModel.setDescription(description);
					comicModel.setAuthor(author);
					comicModel.setAuthorCode(authorCode);
					comicModel.setThumbnail(thumbnail);
					comicModel.setStatus(status);
					comicModel.setLink(element.select("h3.truyen-title > a").attr("href"));
					comicModel.setNumberOfChapter(numberOfChapter);
					comicModel.setRating(rating);
					comicModel.setViews(views);
					for (Element category : categoriesStory) {
						for (Category cate : categories) {
							if (category.text().equals(cate.getName())) {
								// commicModel.getCategories().add(cate);
								cate.getComics().add(comicModel);
							}
						}
					}
					commicRepository.save(comicModel);
					System.out.println(commicRepository.findAll().size());
					crawlChapterOfCommic(element.select("h3.truyen-title > a").attr("href"), comicModel);

				} else {
					System.out.println("vo else");
					if (chapterRepository.findByTitleStartingWith(title + " - " + numberOfChapter) == null) {
						System.out.println("chua craw het truyen" + commicRepository.findAll().size());
						System.out.println(title + " - " + numberOfChapter);
						crawlChapterOfCommic(element.select("h3.truyen-title > a").attr("href"),
								commicRepository.findByTitle(title));
					} else {
						System.out.println("Da craw full chapter");
					}
				}
			}
		}

		return "success";
	}
}

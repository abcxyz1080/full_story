package com.demo.truyenfull.filter.controller;

import java.util.List;

import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.demo.truyenfull.filter.model.Category;
import com.demo.truyenfull.filter.model.Chapter;
import com.demo.truyenfull.filter.model.Comic;
import com.demo.truyenfull.filter.repository.CategoryRepository;
import com.demo.truyenfull.filter.repository.ChapterRepository;
import com.demo.truyenfull.filter.repository.ComicRepository;
import com.demo.truyenfull.filter.util.ResponseUtil;
import com.demo.truyenfull.lib.TFilterService;

@Controller
public class FilterController implements TFilterService.Iface {

	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	ComicRepository comicRepository;
	@Autowired
	ChapterRepository chapterRepository;

	@Override
	public String getAllCategory() throws TException {
		return ResponseUtil.returnListCategory(categoryRepository.findAll()).toString();
	}

	@Override
	public String getAllComic() throws TException {
		return ResponseUtil.returnListComic(comicRepository.findAll()).toString();
	}

	@Override
	public String findComicByName(String name) throws TException {
		return ResponseUtil.returnComic(comicRepository.findByTitleLike(name)).toString();
	}

	@Override
	public String findComicByCategory(String link) throws TException {
		Category category = categoryRepository.findByLink(link);
		List<Comic> comics = comicRepository.findAllByCategories(category);
		return ResponseUtil.returnListComic(comics).toString();
	}

	@Override
	public String findComicByAuthor(String authorCode) throws TException {
		List<Comic> comics = comicRepository.findByAuthorCode(authorCode);
		return ResponseUtil.returnListComic(comics).toString();
	}

	@Override
	public String findComicLastUpdate() throws TException {
		List<Comic> comics = comicRepository.findComicLastUpdate();
		return ResponseUtil.returnListComic(comics).toString();
	}

	@Override
	public String findComicLastCreate() throws TException {
		List<Comic> comics = comicRepository.findComicLastCreate();
		return ResponseUtil.returnListComic(comics).toString();
	}

	@Override
	public String findComicIsFull() throws TException {
		List<Comic> comics = comicRepository.findComicIsFull("Full");
		return ResponseUtil.returnListComic(comics).toString();
	}

	@Override
	public String findComicIsRelease() throws TException {
		List<Comic> comics = comicRepository.findComicIsRelease("Đang ra");
		return ResponseUtil.returnListComic(comics).toString();
	}

	@Override
	public String findComicMostRate() throws TException {
		List<Comic> comics = comicRepository.findComicMostRate();
		return ResponseUtil.returnListComic(comics).toString();
	}

	@Override
	public String findComicMostView() throws TException {
		List<Comic> comics = comicRepository.findComicMostView();
		return ResponseUtil.returnListComic(comics).toString();
	}

	@Override
	public String getComicChapters(String linkComic) throws TException {
		Long idComic = comicRepository.findByLink(linkComic).getId();
		List<Chapter> chapters = chapterRepository.getComicChapters(idComic);
		return ResponseUtil.returnListChapter(chapters).toString();
	}

}

package com.demo.truyenfull.api.controller;

import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.truyenfull.api.config.FilterComicClient;

@RestController
public class FilterController {

	@Autowired
	private FilterComicClient client;

	@GetMapping(value = "/category", produces = "application/json")
	public String getAllCategories() throws TException {
		return client.getAllCategory();
	}

	@GetMapping(value = "/comic", produces = "application/json")
	public String getAllComics() throws TException {
		return client.getAllComic();
	}

	@GetMapping(value = "/the-loai/{linkCategory}", produces = "application/json")
	public String getComicsByCategory(@PathVariable String linkCategory) throws TException {
		return client.findComicByCategory(linkCategory);
	}

	@GetMapping(value = "/tac-gia/{authorCode}/", produces = "application/json")
	public String getComicsByAuthor(@PathVariable String authorCode) throws TException {
		return client.findComicByAuthor(authorCode);
	}

	@GetMapping(value = "/comic-new", produces = "application/json")
	public String getComicLastCreate() throws TException {
		return client.findComicLastCreate();
	}

	@GetMapping(value = "/comic-update-new", produces = "application/json")
	public String getComicLastUpdate() throws TException {
		return client.findComicLastUpdate();
	}

	@GetMapping(value = "/comic-full", produces = "application/json")
	public String getComicIsFull() throws TException {
		return client.findComicIsFull();
	}

	@GetMapping(value = "/comic-release", produces = "application/json")
	public String getComicIsRelease() throws TException {
		return client.findComicIsRelease();
	}

	@GetMapping(value = "/comic-views", produces = "application/json")
	public String getComicMostViews() throws TException {
		return client.findComicMostView();
	}

	@GetMapping(value = "/comic-rating", produces = "application/json")
	public String getComicMostRating() throws TException {
		return client.findComicMostRate();
	}

	@GetMapping(value = "/{linkComic}/", produces = "application/json")
	public String getComicChapters(@PathVariable String linkComic) throws TException {
		System.out.println("abc");
		linkComic = "https://truyenfull.vn/" + linkComic + "/";
		System.out.println(linkComic);
		return client.getComicChapters(linkComic);
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.truyenfull.filter.util;

import java.util.List;

import com.demo.truyenfull.filter.constants.StatusCode;
import com.demo.truyenfull.filter.model.Category;
import com.demo.truyenfull.filter.model.Chapter;
import com.demo.truyenfull.filter.model.Comic;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ResponseUtil {

	private static ObjectMapper mapper = new ObjectMapper();

	public static String success(JsonNode body) {
		ObjectNode node = mapper.createObjectNode();
		node.put("StatusCode", StatusCode.SUCCESS.getValue());
		node.put("Message", StatusCode.SUCCESS.getValue());
		node.set("Response", body);
		return node.toString();
	}

	public static String notfound() {
		ObjectNode node = mapper.createObjectNode();
		node.put("StatusCode", StatusCode.NOT_FOUND.getValue());
		node.put("Message", StatusCode.NOT_FOUND.getValue());
		node.put("Response", "");
		return node.toString();
	}

	public static String invalid() {
		ObjectNode node = mapper.createObjectNode();
		node.put("StatusCode", StatusCode.PARAMETER_INVALID.getValue());
		node.put("Message", StatusCode.PARAMETER_INVALID.getValue());
		node.put("Response", "");
		return node.toString();
	}

	public static String serverError() {
		ObjectNode node = mapper.createObjectNode();
		node.put("StatusCode", StatusCode.SERVER_ERROR.getValue());
		node.put("Message", StatusCode.SERVER_ERROR.getValue());
		node.put("Response", "");
		return node.toString();
	}

	// Story
	public static ObjectNode returnComic(Comic comic) {
		ObjectNode node = mapper.createObjectNode();
		node.put("id", comic.getId());
		node.put("title", comic.getTitle());
		// node.put("content", comic.getDescription());
		node.put("views", comic.getViews());
		node.put("rating", comic.getRating());
		node.put("author", comic.getAuthor());
		node.put("link", comic.getLink());
		node.put("status", comic.getStatus());
		// node.set("chapters", returnListChapter(story.getChapters()));
		// node.set("categories", returnListCategory(story.getCategories()));
		return node;
	}

//	public static ObjRedisConfigectNode returnComic(Optional<Comic> comic) {
//		ObjectNode node = mapper.createObjectNode();
//		node.put("id", comic.getId());
//		node.put("title", comic.getTitle());
//		return node;
//	}

	public static ArrayNode returnListComic(List<Comic> stories) {
		ArrayNode node = mapper.createArrayNode();
		for (Comic story : stories) {
			node.add((returnComic(story)));
		}
		return node;
	}

	// Category
	public static ObjectNode returnCategory(Category category) {
		ObjectNode node = mapper.createObjectNode();
		node.put("id", category.getId());
		// node.put("link", category.getLink());
		node.put("name", category.getName());
		// node.set("stories", returnListStory(category.getStories()));
		return node;
	}

	public static ArrayNode returnListCategory(List<Category> categorys) {
		ArrayNode node = mapper.createArrayNode();
		for (Category category : categorys) {
			node.add((returnCategory(category)));
		}
		return node;
	}

	// Chapter

	public static ObjectNode returnChapter(Chapter chapter) {
		ObjectNode node = mapper.createObjectNode();
		node.put("id", chapter.getId());
		node.put("title", chapter.getTitle());
		// node.put("content", chapter.getContent());
		// node.put("link", chapter.getLink());
		return node;
	}

	public static ArrayNode returnListChapter(List<Chapter> chapters) {
		ArrayNode node = mapper.createArrayNode();
		for (Chapter chapter : chapters) {
			node.add((returnChapter(chapter)));
		}
		return node;
	}

}

package com.demo.truyenfull.api.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.truyenfull.api.config.CrawlerClient;

@RestController
public class CrawlerController {

	@Autowired
	private CrawlerClient client;

	@GetMapping(value = "/crawlerStory")
	public String crawlerStory(HttpServletRequest request) throws TException {
		return client.crawler();
	}

}

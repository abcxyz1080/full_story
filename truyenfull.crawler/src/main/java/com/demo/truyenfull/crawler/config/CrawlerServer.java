package com.demo.truyenfull.crawler.config;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.truyenfull.crawler.controller.CrawlerController;
import com.demo.truyenfull.lib.TCrawlerService;

@Configuration
public class CrawlerServer {
	@Bean
	public TProtocolFactory tProtocolFactory() {
		return new TBinaryProtocol.Factory();
	}

	@Bean
	public ServletRegistrationBean<TServlet> thriftBookServlet(TProtocolFactory protocolFactory,
			CrawlerController controller) {
		TServlet tServlet = new TServlet(new TCrawlerService.Processor<>(controller), protocolFactory);

		return new ServletRegistrationBean<TServlet>(tServlet, "/crawler");
	}
}

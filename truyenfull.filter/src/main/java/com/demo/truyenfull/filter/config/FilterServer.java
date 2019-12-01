package com.demo.truyenfull.filter.config;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.truyenfull.filter.controller.FilterController;
import com.demo.truyenfull.lib.TFilterService;

@Configuration
public class FilterServer {
	@Bean
	public TProtocolFactory tProtocolFactory() {
		return new TBinaryProtocol.Factory();
	}

	@Bean
	public ServletRegistrationBean<TServlet> thriftBookServlet(TProtocolFactory protocolFactory,
			FilterController controller) {
		TServlet tServlet = new TServlet(new TFilterService.Processor<>(controller), protocolFactory);

		return new ServletRegistrationBean<TServlet>(tServlet, "/filter");
	}
}

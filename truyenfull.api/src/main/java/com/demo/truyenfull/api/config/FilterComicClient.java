/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.truyenfull.api.config;

import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.transport.THttpClient;
import org.apache.thrift.transport.TTransportException;
import org.springframework.stereotype.Component;

import com.demo.truyenfull.lib.TFilterService;

@Component
public class FilterComicClient extends TFilterService.Client {

	public FilterComicClient(TProtocolFactory tProtocolFactory) throws TTransportException {
		super(tProtocolFactory.getProtocol(new THttpClient("http://localhost:8082/filter")));
	}

}

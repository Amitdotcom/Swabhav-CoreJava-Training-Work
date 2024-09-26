package com.techlabs.structural.proxy.test;

import com.techlabs.structural.proxy.model.Internet;
import com.techlabs.structural.proxy.model.ProxyServer;

public class ProxyInternetTest {
	public static void main(String[] args) {
		 Internet internet = new ProxyServer();
	        internet.connectTo("google.com");
	        internet.connectTo("youtube.com");
	}
}

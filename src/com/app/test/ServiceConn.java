package com.app.test;

public class ServiceConn implements AutoCloseable {
		
	public void close() {
		System.out.println("Hey!!closed!");
		System.out.println("New line");
	}
} 


package com.ws;


import javax.xml.ws.Endpoint;

//Endpoint publisher
public class HelloWSPublisher{
	
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8080/ws/hello", new HelloWS());
    }

	public HelloWSPublisher() {
		super();
		// TODO Auto-generated constructor stub
	}

}
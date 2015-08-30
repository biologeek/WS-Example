package com.ws;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(endpointInterface="com.ws.HelloWS")
@SOAPBinding(style=Style.RPC)
public class HelloWS {

	
	public HelloWS() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	private String message = "Bonjour ";
	
	
	@WebMethod
	public String sayHello (String name){
		
		return message + name;
	}
}

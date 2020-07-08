package com.qa.helloworld;

import java.util.Scanner;

public class HelloWorld{
	
	private String message;
	private Scanner scanMessage  = new Scanner(System.in);
	
	public HelloWorld() {
		
	}
	
	public HelloWorld (String message) {

		this.message = message;
	}

	public String getMessage() {
		// use scanner to get message
		System.out.println("Please enter your message: ");
		message = scanMessage.nextLine();
		return message;
		
	}
	
//	public void greetMessage() {
////	Greeting greetService1 = message ->
////    System.out.println("Hello " + message);
////    greetService1.sayMessage("Frank");
////	}
	
	public String returnMessage() {
		message = "Gulp!";
		return message;
	}
	
	public void printOneMessage() {
		message = "Ta da!";
		System.out.println(message);
		
	}
	
	public void printMessage(String message) {
		this.message = message;
		System.out.println(message);
	}

	
	

}

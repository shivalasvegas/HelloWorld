package com.qa.helloworld;

public class HelloWorld {
	
//	public static void main(String[] args) {
//		printMessage("Hello World");
//		printOneMessage();
//		System.out.println(returnMessage());
//
//	}
//	
	public String returnMessage() {
		String message = "Gulp!";
		return message;
	}
	
	public void printOneMessage() {
		String message = "Ta da!";
		System.out.println(message);
		
	}
	
	public void printMessage(String message) {

		System.out.println(message);
	}

}

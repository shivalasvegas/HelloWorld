package com.qa.helloworld;

public class HelloWorld {
	
	public static void main(String[] args) {
		printMessage("Hello World");
		printOneMessage();
		System.out.println(returnMessage());

	}
	
	static String returnMessage() {
		String message = "Gulp!";
		return message;
	}
	
	static void printOneMessage() {
		String message = "Ta da!";
		System.out.println(message);
		
	}
	
	static void printMessage(String message) {

		System.out.println(message);
	}

}

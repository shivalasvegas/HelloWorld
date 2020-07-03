package com.qa.helloworld;



public class HelloWorld {
	
	public HelloWorld() {
		
	}

	public void greetMessage() {
	Greeting greetService1 = message ->
    System.out.println("Hello " + message);
    greetService1.sayMessage("Vin");
	}
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

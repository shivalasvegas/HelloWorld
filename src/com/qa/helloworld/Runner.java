package com.qa.helloworld;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		HelloWorld printOut = new HelloWorld();
		
		printOut.greetMessage();
		printOut.printOneMessage();
		
		System.out.println(printOut.returnMessage());
		String message = "Goodbye!";
		
		printOut.printMessage(message);
		
		printOut.greetMessage();
		
		String scanMessage  = printOut.getMessage();
		printOut.printMessage(scanMessage);
		
		
	}

}

package com.qa.helloworld;

import java.util.ArrayList;
import java.util.List;

public class Greeter {
	String message;
	
	List<Greeting> greetingArray = new ArrayList<>();

	public Greeter() {
		
	}
	
	
	public void addGreeting(Greeting greeting) {
		greetingArray.add(greeting);	
	}

	public void greet() {
		for(Greeting greeting : greetingArray) {
			message = greeting.sayGreeting();
			System.out.println(message);
		}	
	}
}

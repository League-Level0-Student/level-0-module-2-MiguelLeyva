//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		for (int i = 0; i < 10; i++) {
			
		
		if(randomNumber==0) {
			System.out.println("You have nice hair");
		}
		if(randomNumber==1) {
			System.out.println("You have a nice smile");
		}
		if(randomNumber==2) {
			System.out.println("You're very smart");
		}
		if(randomNumber==3) {
			System.out.println("Have a good day");
		}
		if(randomNumber==4) {
			System.out.println("Have a splendid day");
		}
		}
		
		
				// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}

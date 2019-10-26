//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer
public static void main(String[] args) {
	
	Random r = new Random();
	int r2 = r.nextInt(4);
	System.out.println(r2);
	JOptionPane.showInputDialog("Go forth and present your question the magical 8 Ball...");
	if(r2==0) {
		System.out.println("Yes");
	}
	if(r2==1) {
		System.out.println("No");
	}
	if(r2==2) {
		System.out.println("...Ask Google");
	}
	if(r2==3) {
		System.out.println("It is too early to tell...");
	}
	
	
}
}

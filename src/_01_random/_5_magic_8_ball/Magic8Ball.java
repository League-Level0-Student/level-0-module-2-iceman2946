//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
public static void main(String[] args) {
	// 2. Get the user to enter a question for the 8 ball to answer
	JOptionPane.showInputDialog("Give a question that the Magic 8 Ball can answer?");

		// 3. Make a variable and initialize it to a random number.
		//     ** You will need to make a random object!
		//     Limit the random numbers to be between 0 and 3
		Random randomObject = new Random();
		int randomNumber=randomObject.nextInt(4);
		
		// 4. If the random number is 0
		if(randomNumber==0) {
			JOptionPane.showMessageDialog(null, "Yes");
		}
		// -- tell the user "Yes"

		// 5. If the random number is 1
		else if(randomNumber==1) {
			JOptionPane.showMessageDialog(null, "No");
		}
		// -- tell the user "No"

		// 6. If the random number is 2
		else if(randomNumber==2) {
			JOptionPane.showMessageDialog(null, "Maybe you should ask Google");
		}
		// -- tell the user "Maybe you should ask Google?"

		// 7. If the random number is 3
		else {
			JOptionPane.showMessageDialog(null, "Consult somebody close to you");
		}
		// -- write your own answer
}
	
}

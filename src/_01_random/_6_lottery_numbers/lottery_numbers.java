package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery_numbers {
	public static void main(String[] args) {
		Random ran=new Random();
		int randomNumber1=ran.nextInt(99-10+1);
		int randomNumber2=ran.nextInt(99-10+1);
		int randomNumber3=ran.nextInt(99-10+1);
		int randomNumber4=ran.nextInt(99-10+1);
		int randomNumber5=ran.nextInt(99-10+1);
		int randomNumber6=ran.nextInt(99-10+1);
		JOptionPane.showMessageDialog(null,randomNumber1+ "," +randomNumber2+"," +randomNumber3+","+ randomNumber4+","+ randomNumber5+"," +randomNumber6);
		}
	}



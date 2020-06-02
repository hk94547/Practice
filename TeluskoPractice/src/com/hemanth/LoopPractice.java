package com.hemanth;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		// Loop Practice
		System.out.println("Enter 1 or 2 or 3 for Number Pyramid, Alphabet Pyramid and $square respectively:");
		Scanner s = new Scanner(System.in);
		byte b = s.nextByte();
		switch(b){
		case 1:
			makeNumberPyramid(s);
			break;
		case 2:
			makeAlphabetPyramid(s);
			break;
		case 3:
			makeDollarSuare(s);
			break;
		default:
			System.out.println("default case");
			break;
		}
			
	}
	public static void makeNumberPyramid(Scanner s){
		System.out.println("Enter a Number: ");
		s = new Scanner(System.in);
		byte k = s.nextByte();
		for(byte i=1;i<=k;i++){
			byte j =1;
			while(j<=i){
				System.out.print(j);
				j++;
			}
			System.out.println("");
		}
		s.close();
	}
	
	
	public static void makeAlphabetPyramid(Scanner s){
		System.out.println("Enter a Number between 65 and 90: ");
		s = new Scanner(System.in);
		byte k = s.nextByte();
		if(k<65 || k>90)
			System.out.println("please enter a valid number");
		else{
			for(byte i=65;i<=k;i++){
				byte j =65;
				while(j<=i){
					char c = (char)j;
					System.out.print(c);
					j++;
				}
				System.out.println("");
			}
		}
		s.close();
	}
	
	
	public static void makeDollarSuare(Scanner s){
		System.out.println("Enter an even Number: ");
		s = new Scanner(System.in);
		byte k = s.nextByte();
		if(k%2==0){
			byte mid = (byte) (k/2);
			for(byte i =1; i<=k;i++){
				System.out.print("$");
			}
			for(byte i =1;i<=mid;i++){
				System.out.println("");
				for(byte j =1; j<=k;j++){
					if(j==1 || j ==k)
						System.out.print("$");
					else
						System.out.print(" ");
				}
			}
			System.out.println("");
			for(byte i =1; i<=k;i++){
				System.out.print("$");
			}
		}
		else
			System.out.println("Please enter an even number.");
		s.close();
	}
	
}

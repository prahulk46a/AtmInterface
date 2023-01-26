package com.NumberGuessing;
import java.util.*;
public class Method {
	Scanner sc=new Scanner(System.in);
	
void run(){
		
		int random = (int)(1+Math.random() * 500);
		System.out.println("Random No is:"+random); //Use of Math.random() function to genrate random value between 0 to 500
		
		
		
		int k=5;
		while(k>0) {
			System.out.println("Guess the Number:");
			int guess=sc.nextInt();
			if(guess==random) {
				System.out.println("BINGO 😊!! You have guessed correct number!");
				break;
			}
			
			else if(guess<random) {
				System.out.println("Wrong Guess ☹!! Guess number greater than previous one! ");
			}
			
			else if(guess>random){
				System.out.println("Wrong Guess ☹!! Guess number lesser than previous one! ");
			}
			
			
			k--;
		System.out.println("You have "+k+" more attempts remain to guess!!");
				
		}
		
		int count=k;
		switch(count) {
		case 5:
			System.out.println("Your Score is 100 !");
			break;
		case 4:
			System.out.println("Your Score is 75 !");
			break;
		case 3:
			System.out.println("Your Score is 50 !");
			break;
		case 2:
			System.out.println("Your Score is 25 !");
			break;
		case 1:
			System.out.println("Your Score is 10 !");
			break;
		default:
			System.out.println("Your Score is 00! Better luck next time!");
		
		
		}
		
			
		
		
	}

}

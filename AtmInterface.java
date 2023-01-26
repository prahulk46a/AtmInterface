package com.AtmInterface;
import java.util.Scanner;

public class AtmInterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UserId:");
		String UserId=sc.nextLine();
		System.out.println("Enter UserPin:");
		String UserPin=sc.nextLine();
		AtmMethod obj=new AtmMethod(UserId,UserPin);
		
		obj.options();

	}

}

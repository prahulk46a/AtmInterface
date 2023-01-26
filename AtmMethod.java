package com.AtmInterface;
import java.util.*;
 class AtmMethod {
	
	String UserId,UserPin;
	double amt,bal,prevtrans;
	
	AtmMethod(String UserId,String UserPin){
		this.UserId=UserId;
		this.UserPin=UserPin;		
	}
	
	void deposit(double amount) {
		if(amount!=0) {
			bal+=amount;
			prevtrans=amount;
		}
		
	}
	void Withdraw(double amt) {
		if(amt!=0 && bal>=amt) {
			bal-=amt;
			prevtrans=-amt;
		}
		else {
			System.out.println("Bank balance insufficient");
		}
	}
	
	void PrevTransaction() {
		if(prevtrans>0){
            System.out.println("Deposited: "+prevtrans);
        }
        else if(prevtrans<0){
            System.out.println("Withdrawn: "+Math.abs(prevtrans));
        }
        else{
            System.out.println("No transaction occured !");
        }

	}
	
	void options() {
		char option;
		System.out.println("Welcome "+UserId);
		System.out.println("Your ID:"+UserPin);
		System.out.println("\n");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit Amount");
		System.out.println("3. Withdraw Amount");
		System.out.println("4. Previous Transaction");
		System.out.println("5. Exit");
		do {
			
	        
	        Scanner sc=new Scanner(System.in);
	        System.out.println("********************************************");
	        System.out.print("Choose an option:");
	        option=sc.next().charAt(0);
	       
	        
	        switch(option) {
			case '1':
				System.out.println("......................");
                System.out.println("Balance ="+bal);
                System.out.println("......................");
                System.out.println("\n");
                break;
            case '2':
                System.out.println("......................");
                System.out.println("Enter a amount to deposit :");
                System.out.println("......................");
                double amount=sc.nextDouble();
                deposit(amount);
                System.out.println("\n");
                break;
            case '3':
                System.out.println("......................");
                System.out.println("Enter a amount to Withdraw :");
                System.out.println("......................");
                double amt=sc.nextDouble();
                Withdraw(amt);
                System.out.println("\n");
                break;
            case '4':
                System.out.println("......................");
                System.out.println("Previous Transaction:");
                PrevTransaction();
                System.out.println("......................");
                System.out.println("\n");
                break;

            case '5':
                System.out.println("......................");
                break;
            default:
                System.out.println("Choose a correct option to proceed !");
                break;

			}
			
		}while(option!='5');
		System.out.println("Thank you for using this ATM !");
				
		}
	  
	}		
	


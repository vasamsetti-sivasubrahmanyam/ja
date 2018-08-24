package com.capgemini.onlinebanking.ui;

import java.util.Scanner;

import com.capgemini.onlinebanking.entity.Account;

public class AccountMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Account account=new Account();
	String choice;
	int n;
	do {
	System.out.println("*******Account Details*******");
	System.out.println("1.create account");
	System.out.println("2.display balance");
	System.out.println("3.Withdraw balance");
	System.out.println("4.Deposite balance");
	System.out.println("5.Display Transactions");
	n=sc.nextInt();
	switch(n) {
	case 1:
		System.out.println("Enter the First name name");
		String firstName=sc.next();
		System.out.println("enter the lastName name");
		String lastName=sc.next();
		System.out.println("enter the available balnce");
		float accBal=sc.nextFloat();
					Account acc=new Account(firstName,lastName,accBal);
					int accNum=service.addAccount(acc);
					System.out.println("Account number is"+acc);
					break;
}
}
}

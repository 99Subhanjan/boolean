package com.Boolean;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Istrue istrue = new Istrue();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String name = scan.nextLine();
		
		
		boolean check = istrue.check(name);
		
		if(check = true) {
			System.out.println("you matched the string ? " + check);
		}
		else {
			System.out.println("you matched the string ? "+ check);
		}
		
		}
	}



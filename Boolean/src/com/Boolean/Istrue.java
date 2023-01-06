package com.Boolean;
import java.util.Scanner;

public class Istrue {
	
	public static boolean check(String string) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the checking string");
		String name = scan.nextLine();
		if(string.equalsIgnoreCase(name)) {
			return true;
		}
		else {
			return false;
		}
	}

}

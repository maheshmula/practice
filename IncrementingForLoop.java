package com.kn.incrementingfor;

import java.util.Scanner;

public class IncrementingForLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range = ");
		int num = scan.nextInt();
		
		for(int i=num;i>=1;i++) {
			System.out.println(i);
		}
	}

}











package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int w500  = sc.nextInt();
		System.out.print("100원 개수: ");
		int w100  = sc.nextInt();		
		System.out.print("50원 개수: ");
		int w50  = sc.nextInt();		
		System.out.print("10원 개수: ");
		int w10  = sc.nextInt();		

		System.out.println("동전의 총합은 " + (500 * w500 + 100 * w100 + 50 * w50 + 10 * w10) + " 원입니다.");
		
		sc.close();
		
	}

}

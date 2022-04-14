package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final double PI = 3.14;
		
		System.out.print("반지름: "); 
		int r = sc.nextInt();
		
		System.out.println("구의 부피는: " + (PI * 4 / 3 * r * r * r) + " 입니다.");

	}

}

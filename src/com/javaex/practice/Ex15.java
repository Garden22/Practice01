package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final double MILE = 1.609;
		
		System.out.print("마일을 입력하세요: ");
		int km = sc.nextInt();
		
		System.out.println(km + "마일은 " + (km * MILE) + "킬로미터입니다.");
		
		sc.close();
		
	}

}

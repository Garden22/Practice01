package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final float PI = 3.14f;
		
		System.out.print("반지름을 입력하세요: ");
		int r = sc.nextInt();
		
		System.out.println("원의 넓이는 " + PI * r * r);		

		sc.close();
		
	}

}

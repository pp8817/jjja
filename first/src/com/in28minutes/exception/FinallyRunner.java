package com.in28minutes.exception;

import java.util.Scanner;

public class FinallyRunner {
	public static void main(String[] args) {
		
		Scanner scanner = null; // 스캐너가 이용불가능한 try 블럭에서는 정의가 안돼서 밖으로 옮겨줌
		
		try {
			scanner = new Scanner(System.in);
			int[] numbers = {12,3,4,5};
		
			int number = numbers[5]; //예외처리 발생
				
//		scanner.close();//위에서 예외처리가 발생해서 scanner가 실행 종료가 안됨 == 객체유출
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //예외가 생겨도 finally의 코드는 실행됨
			System.out.println("Before Scanner Close");
			if(scanner!=null) { //확실하게 하려고 if문 삽입
				scanner.close(); //예외가 발생해도 스캐너는 닫아줘야해서 finally 블럭에 넣어줌 
			}
		}
		System.out.println("Just before closing out main");
	}

}

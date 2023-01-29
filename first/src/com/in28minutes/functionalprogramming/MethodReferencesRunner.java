package com.in28minutes.functionalprogramming;

import java.util.List;

public class MethodReferencesRunner {
	
	public static void print(Integer number) {
		System.out.println(number);
		
	}
	public static void main(String[] args) {
		List.of("Ant", "Bat","Cat","Dog","Elephant").stream()
			.map(s -> s.length())
			.forEach(s -> System .out.println(s));
		
		//변수 하달 과정을 생략
		List.of("Ant", "Bat","Cat","Dog","Elephant").stream()
			.map(s -> s.length())
			.forEach(System .out::println); // System.out이 클래스 println이 메소드
		
		//위 코드를 설명하기 위한 코드
		List.of("Ant", "Bat","Cat","Dog","Elephant").stream()
			.map(String::length)
			.forEach(MethodReferencesRunner::print); //MethodReferencesRunner: 클래스, print: 메소드
		
//		Integer max = List.of(23,45,67,34).stream()
//				.filter(n -> n % 2 ==0)
//				.max((n1,n2) -> Integer.compare(n1, n2))
//				.orElse(0); //변수에 값이 없을때 출력되는 기본값 설정
		
		//코드의 가독성을 향상
		Integer max = List.of(23,45,67,34).stream()
				.filter(MethodReferencesRunner::isEven)
				.max(Integer::compare)
				.orElse(0); //변수에 값이 없을때 출력되는 기본값 설정
		System.out.println(max);
	}
	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}
}

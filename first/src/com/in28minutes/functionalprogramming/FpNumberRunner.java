package com.in28minutes.functionalprogramming;

import java.util.List;



public class FpNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4,6,8,13,3,15);
		
		numbers.stream().forEach(element -> System.out.println(element));
		
		int sum = FpSum(numbers);	

		System.out.println(sum);
	}

	private static int FpSum(List<Integer> numbers) {
		return numbers.stream()
//				.filter(number->number%2==1)
				.reduce(0, (number1, number2)-> {
					System.out.println(number1 + " " + number2);
					return number1 + number2;
					}
				);
	}

	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for(int number:numbers) {
			sum += number;
		}
		return sum;
	}

}

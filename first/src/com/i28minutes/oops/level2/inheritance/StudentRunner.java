package com.i28minutes.oops.level2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
//		Student student = new Student();
//		student.setName("Ranga");
//		student.setEmail("pp8817@naver,com");
//		
//		Person person = new Person();
		
		Employee employee = new Employee("Ranga", "Programmer Analyst");
//		employee.setName("Ranga"); 
		employee.setEmail("pp8817@naver.com");
		employee.setPhoneNumber("123-456-7890");
		employee.setEmployeeGrade('A');
		employee.setTitle("Programmer Analyst");
		
		System.out.println(employee);
	}

}

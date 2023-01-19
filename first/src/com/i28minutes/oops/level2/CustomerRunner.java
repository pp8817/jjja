package com.i28minutes.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeAddress = new Address("line1", "Hyderabad", "500025");
		Customer customer = new Customer("Ranga", homeAddress);
		
		Address workAddress = new Address("line1 of work", "Hyderabad", "500078");
		customer.setWorkAddress(workAddress);
		
		System.out.println(customer);
	}

}

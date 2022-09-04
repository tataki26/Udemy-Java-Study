package com.udemyjava.oop.level2;

public class CustomerRunner
{

	public static void main(String[] args)
	{
		Address homeAddress = new Address("line1", "Seoul", "5008");
		Customer customer = new Customer("takityaki", homeAddress);
		
		System.out.println(customer);
		
		Address workAddress = new Address("line1 for work", "Seoul", "5002");
		customer.setWorkAddress(workAddress);
		
		System.out.println(customer);

	}

}

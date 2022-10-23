package com.udemyjava.api.h;

public class RecordsRunner
{

	// record Person(String name, String email, String phoneNumber) {}
	
	// 사용자 정의 구현
	record Person(String name, String email, String phoneNumber) {
		
		// not valid
		// int number;
		
		// valid
		static int number;
		
		// compact constructor
		Person {	
			// validation check
			if(name == null)
				throw new IllegalArgumentException("name is null");
		}
		
		public String name() {
			System.out.println("Do Something");
			return name;
		}
	}
	
	public static void main(String[] args)
	{
		Person person1 = new Person("Rakan", "rakan@udemyjava.com", "123-456");
		Person person2 = new Person("Jaya", "jaya@udemyjava.com", "345-678");
		Person person3 = new Person("Rakan", "rakan@udemyjava.com", "123-456");
		
		System.out.println(person1.equals(person2));
		System.out.println(person1.equals(person3));

		System.out.println(person2.name());
	}

}

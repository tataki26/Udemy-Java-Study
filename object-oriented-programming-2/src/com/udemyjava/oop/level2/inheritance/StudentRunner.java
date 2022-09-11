package com.udemyjava.oop.level2.inheritance;

public class StudentRunner
{

	public static void main(String[] args)
	{
		Student student = new Student();
		
		// super class의 setter
		student.setName("Takityaki");
		student.setEmail("takoyaki2077@gmail.com");
		
		Person person = new Person();
		
		// Person에 정의되지 않은 메소드
		// Person이 상속하고 있는 Object의 메소드
		String value = person.toString();
		
		System.out.println(value);
		System.out.println(person);

	}

}

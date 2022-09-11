package com.udemyjava.oop.level2.inheritance;

public class Person
{
	private String name;
	private String email;
	private String phoneNumber;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	// Person 클래스에서 Object 클래스의 메서드를 덮어쓰기(override) 함
	public String toString()
	{
		return name + "#" + email + "#" + phoneNumber + "#";
	}
}

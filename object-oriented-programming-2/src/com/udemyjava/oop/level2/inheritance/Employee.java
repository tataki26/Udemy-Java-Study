package com.udemyjava.oop.level2.inheritance;

import java.math.BigDecimal;

public class Employee extends Person
{
	private String title;
	private String employer;
	private char employeeGrade;
	private BigDecimal salary;
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getEmployer()
	{
		return employer;
	}
	
	public void setEmployer(String employer)
	{
		this.employer = employer;
	}
	
	public char getEmployeeGrade()
	{
		return employeeGrade;
	}
	
	public void setEmployeeGrade(char employeeGrade)
	{
		this.employeeGrade = employeeGrade;
	}
	
	public BigDecimal getSalary()
	{
		return salary;
	}
	
	public void setSalary(BigDecimal salary)
	{
		this.salary = salary;
	}
	
	public String toString()
	{
		return "title: " + title + ", " + "employee grade: " + employeeGrade + ", "
				// super: 상위 클래스 멤버에 접근 
				+ "name: " + super.getName() + ", " + "email: " + super.getEmail();
				// or super.toString();
	}
	
}

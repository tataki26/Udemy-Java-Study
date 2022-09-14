package com.udemyjava.oop.level2.inheritance;

abstract class Animal
{
	abstract void bark();
}

class Dog extends Animal
{
	public void bark()
	{
		System.out.println("Bow Bow");
		
	};
	
}

class Cat extends Animal
{
	public void bark()
	{
		System.out.println("Meow Meow");
		
	};
	
}

public class AnimalRunner
{
	public static void main(String[] args)
	{
		// 같은 참조 변수의 같은 메서드를 호출
		// 그러나, 두 가지 다른 행동 방식을 보임
		// 다형성: 같은 코드, 다른 행동 양식
		Animal[] animals = { new Dog(), new Cat() };
		
		for(Animal animal: animals)
		{
			animal.bark();
		}
		
	}

}

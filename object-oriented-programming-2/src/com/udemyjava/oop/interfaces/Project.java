package com.udemyjava.oop.interfaces;

public class Project
{

	public static void main(String[] args)
	{
		// 이 코드 한 줄만 바꿔도 원하는 동작 실행 가능 
		// ComplexAlgorithm algorithm = new DummyAlgorithm();
		ComplexAlgorithm algorithm = new RealAlgorithm();
		
		System.out.println(algorithm.complexAlgorithm(10, 20));

	}

}

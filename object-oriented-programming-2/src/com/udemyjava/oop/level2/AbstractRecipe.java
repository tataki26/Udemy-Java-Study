package com.udemyjava.oop.level2;

public abstract class AbstractRecipe
{
	// 상위 알고리즘
	// 필요한 과정을 독립적으로 나누고 하나의 메서드에 정의
	public void execute()
	{
		getReady();
		prepareTheDish();
		cleanup();
	}
	
	abstract void getReady();
	abstract void prepareTheDish();
	abstract void cleanup();

}

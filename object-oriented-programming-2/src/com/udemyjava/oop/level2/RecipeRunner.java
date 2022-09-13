package com.udemyjava.oop.level2;

public class RecipeRunner
{

	public static void main(String[] args)
	{
		Recipe recipe = new Recipe();
		recipe.execute();
		
		RecipeWithMicrowave recipeWithMicrowave = new RecipeWithMicrowave();
		recipeWithMicrowave.execute();
	}

}

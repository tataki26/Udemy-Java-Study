package com.udemyjava.oop.level2;

import java.util.ArrayList;

public class Book
{
	private int id;
	private String name;
	private String author;
	
	// 책 한 권 당 리뷰 여러 개
	private ArrayList<Review> reviews = new ArrayList<>();

	public Book(int id, String name, String author)
	{
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	public void addReview(Review review)
	{
		this.reviews.add(review);
	}

	public String toString()
	{
		return "[id=" + id + ", name=" + name + ", author=" + author + ", "
				+ "reviews=" + reviews + "]";
	}
	
}

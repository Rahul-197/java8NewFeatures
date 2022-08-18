package com.rahul.java8Features.lemdaExpression;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BooksService {
	public List<Book> getBooksInSort()
	{
		List<Book> books = new BookDao().getBooks();
	//1.	Collections.sort(books,new MyComprator());
	/*//2.
	 *Collections.sort(books,new Comparator<Book>() {
	 * 
	 * @Override public int compare(Book o1, Book o2) { // TODO Auto-generated
	 * method stub return o2.getName().compareTo(o1.getName()); } });
	 */
	//3 way lemda
		
		Collections.sort(books,(o1,o2)->o2.getId().compareTo(o1.getId()));
		
		return books;
	}
	public static void main(String[] args) {
		System.out.println(new BooksService().getBooksInSort());
	}
}
/*
 * //traditional way we use lemda class MyComprator implements Comparator<Book>
 * {
 * 
 * @Override public int compare(Book o1, Book o2) { // TODO Auto-generated
 * method stub return o2.getName().compareTo(o1.getName()); } }
 */

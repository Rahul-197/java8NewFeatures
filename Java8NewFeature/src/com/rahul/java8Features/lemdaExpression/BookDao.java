package com.rahul.java8Features.lemdaExpression;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

	public List<Book> getBooks(){
	List<Book> books = new ArrayList<>();
	books.add(new Book(101, "ramayan", 1000));
	books.add(new Book(102, "mahabharat", 1001));
	books.add(new Book(103, "Gita", 1003));
	books.add(new Book(104, "krishna", 1004));
	books.add(new Book(105, "vishanupuran", 1005));
	return books;
}
}

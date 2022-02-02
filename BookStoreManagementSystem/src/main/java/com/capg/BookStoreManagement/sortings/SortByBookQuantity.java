package com.capg.BookStoreManagement.sortings;

import java.util.Comparator;
import com.capg.BookStoreManagement.beans.Book;

public class SortByBookQuantity implements Comparator<Book> {
	public int compare(Book b1,Book b2) {
    	return b1.getQty() - b2.getQty();
	}
}
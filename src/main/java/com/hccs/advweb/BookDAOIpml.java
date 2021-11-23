package com.hccs.advweb;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAOIpml implements BookDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Book> getBookList() {
		ArrayList<Book> bookList = (ArrayList<Book>) sessionFactory.getCurrentSession().createQuery("FROM Book").list();
		return bookList;
	}
	
}

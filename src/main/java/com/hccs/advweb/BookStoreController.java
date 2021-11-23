package com.hccs.advweb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class BookStoreController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value = "/index")
	public ModelAndView indexView(ModelAndView model) {
		ArrayList<Book> bookList = (ArrayList<Book>) bookService.getBookList();
		model.addObject("bookList", bookList);
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping(value = "/about")
	public String aboutView() {
		return "about";
	}
	
	@RequestMapping(value = "/contact")
	public String contactView() {
		return "contact";
	}
	
	@RequestMapping(value = "/products")
	public ModelAndView productsView(ModelAndView model) {
		ArrayList<Book> allBookList = (ArrayList<Book>) bookService.getBookList();
		model.addObject("allBookList", allBookList);
		model.setViewName("products");
		return model;
	}
}

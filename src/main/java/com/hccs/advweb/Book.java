package com.hccs.advweb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "title")
	private String title;
	@Column(name = "price")
	private double price;
	@Column(name = "description")
	private String description;
	@Column(name = "imageUrl")
	private String imageUrl;
	@Column(name = "category")
	private String category;
	
	private Book(String title, double price, String description, String imageUrl, String category) {
		super();
		this.title = title;
		this.price = price;
		this.description = description;
		this.imageUrl = imageUrl;
		this.category = category;
	}
	
	private Book() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}

package com.bridgelabz.behavioral.visitor;


public class Book implements ItemElement {

	private int price;
	private String inNumber;

	public Book(int price, String inNumber) {
		super();
		this.price = price;
		this.inNumber = inNumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInNumber() {
		return inNumber;
	}

	public void setInNumber(String inNumber) {
		this.inNumber = inNumber;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		// this is the object defines the under the fruit
		return visitor.visit(this);
	}

}
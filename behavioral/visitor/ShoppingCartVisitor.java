package com.bridgelabz.behavioral.visitor;


public interface ShoppingCartVisitor {

	int visit(Book visitor);
	int visit(Fruit fruit);
}
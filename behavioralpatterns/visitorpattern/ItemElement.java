package com.bridgelabz.designpatterns.behavioralpatterns.visitorpattern;

public interface ItemElement 
{
	public int accept(ShoppingCartVisitor visitor);

}

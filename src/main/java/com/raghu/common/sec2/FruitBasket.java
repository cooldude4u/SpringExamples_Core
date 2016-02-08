package com.raghu.common.sec2;


public class FruitBasket {

	private String name;
	private List<String> fruits;

	public FruitBasket() {
	}

	public FruitBasket(String name, List<String> fruits) {
		this.name = name;
		this.fruits = fruits;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getFruits() {
		return fruits;
	}
	
	public setFruits(List<String> fruits) {
		this.fruits = fruits;
	}
}


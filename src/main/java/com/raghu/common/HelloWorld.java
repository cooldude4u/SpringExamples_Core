package com.raghu.common;

public class HelloWorld {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("Hello Spring ...!" + name);
	}


}

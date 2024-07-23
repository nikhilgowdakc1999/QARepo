package com.sgtesting.string1;

public class StringToObjectExample {

	public static void main(String[] args) throws Exception {

		Class c=Class.forName("java.lang.String");
		System.out.println("class name: "+c.getName());
		System.out.println("superclass name: "+c.getSuperclass().getName());
	}

}

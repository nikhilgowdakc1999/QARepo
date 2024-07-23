package com.sgtesting.string1;

// printing Hello without using semicolon
public class HelloWithoutsemicolon {

	public static void main(String[] args) {

		if(System.out.printf("Hello World"+"\n")==null) {

		}
		if(System.out.append("Hello World"+"\n")==null) {

		}
		if(System.out.append("Hello World"+"\n").equals(null)) {

		}
		for(int i=0;i<2;System.out.println("Hello World")) {
			i++;
		}
	}

}

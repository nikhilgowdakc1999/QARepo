package com.sgtesting.string1;

public class trailismart {

	public static void main(String[] args) {
		String s="ismart energy water";  
		String x="";
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=a[i].length()-1;j>=0;j--)
			{
			/*	Character ch=a[i].charAt(j);
				x=x+ch; */
			  System.out.print(a[i].charAt(j));    
			}

		}
		System.out.println(x);
	}

}

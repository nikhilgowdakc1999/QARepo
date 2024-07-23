package com.sgtesting.string1;

public class TrailTalent {

	public static void main(String[] args) {
		String s="aabbcc";
		char[] a = s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(i%2==1)
			{
				System.out.print(2);
			}
			else 
			{
				System.out.print(a[i]);
			}
		}
		
	}

}

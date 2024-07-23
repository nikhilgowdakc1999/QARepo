package com.sgtesting.string1;

public class MagicNumber {
	public static boolean isMagic(int n)
	{
		int sum = 0;

		// Note that the loop continues 
		// if n is 0 and sum is non-zero.
		// It stops when n becomes 0 and
		// sum becomes single digit.
		while (n > 0 || sum > 9)
		{
			if (n == 0)
			{
				n = sum;
				sum = 0;
			}
			sum += n % 10;
			n /= 10;
		}

		// Return true if sum becomes 1.
		return (sum == 1);
	}
	public static void Magicno()
	{
		int x=325;
		if(x%9==1)
		{
			System.out.println(x+" is a magic no");
		}
		else 
		{
			System.out.println(x+" is not a magic no");
		}
	}




	public static void main(String[] args) {

		int n = 1234;
		if (isMagic(n))
			System.out.println("Magic Number");

		else
			System.out.println("Not a magic Number");
		System.out.println("------------------------------");

		MagicNumber.Magicno();
	}

}

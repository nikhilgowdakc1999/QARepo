package com.sgtesting.methods;
// difference b/n method hodding and method overriding

//parent class  
class Demo  
{  
	public static void method1()  
	{  
		System.out.println("Method-1 of the Demo class is executed.");  
	}  
	public void method2()  
	{  
		System.out.println("Method-2 of the Demo class is executed.");  
	}  
}  
//child class  
class Sample extends Demo  
{  
	public static void method1()  
	{  
		System.out.println("Method-1 of the Sample class is executed.");  
	}  
	public void method2()  
	{  
		System.out.println("Method-2 of the Sample class is executed.");  
	} 
}
public class MethodHidding {
	public static void main(String[] args) 
	{
		Demo d1 = new Demo();  
		//d2 is reference variable of class Demo that points to object of class Sample  
		Demo d2 = new Sample();  
		//method calling with reference (method hiding)  
		d1.method1();  
		d2.method1();  
		//method calling with object (method overriding)  
		d1.method2();  
		d2.method2();  
	}  
}



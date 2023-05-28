package Complexity;

public class SpaceComplexcity //Swamping number
{
	public static void withSpaceComplexity()
	{
		int a=10;
		int b=20;
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a -> "+a);
		System.out.println("b -> "+b);
	}
	public static void withOutSpaceComplexity()
	{
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a -> "+a);
		System.out.println("b -> "+b);
	}
	public static void main(String[] args) 
	{
		withSpaceComplexity();
		System.out.println("---------------------");
		withOutSpaceComplexity();
	}
}

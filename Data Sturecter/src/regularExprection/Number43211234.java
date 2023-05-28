package regularExprection;

public class Number43211234 
{
	static void num(int n)
	{
		if(n>=1)
		{
			System.out.print(n);
			num(n-1);
			System.out.print(n);
		}
	}
	public static void main(String[] args) 
	{
		num(4);
	}

}

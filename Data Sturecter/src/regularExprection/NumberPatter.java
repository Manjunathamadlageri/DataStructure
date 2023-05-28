package regularExprection;

public class NumberPatter 
{
static void row(int n)
{
	if(n>=1)
	{
		col(1);
		System.out.println();
		row(n-1);
		
	}
}
static void col(int n)
{
	if(n<=5)
	{
		System.out.print(n+" ");
		col(n+1);
	}
}
	public static void main(String[] args) 
	{
		row(5);
	}

}

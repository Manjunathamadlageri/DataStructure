package Complexity;

public class bigO_nLogn 
{
	public static void main(String[] args) 
	{
		int n=8;
		while(n>=1)
		{
			int n1=n;
			n1=n1/2;
			for(int i=0;i<n;i++)
			{
				int n2=n;
				n2=n2/2;
				
			}
			System.out.print(n1);
		}
	}
}

 package string;

public class Remove_Last_And_Firstelement 
{
static void remove(String s)
{
	System.out.println(s);
	int lp=0,rp=s.length()-1;
	for(int i=0;i<s.length()-1;i++)
	{
		if(i%2==0)
		{
			rp--;
		}
		else
		{
			lp++;
		}
		String temp="";
		for(int j=lp;j<rp;j++)
		{
			temp=temp+s.charAt(j);
		}
		System.out.println(temp);
	}
}
	public static void main(String[] args) 
	{
       String s="combination";
       remove(s);
	}

}

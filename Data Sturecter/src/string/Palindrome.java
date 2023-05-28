package string;

public class Palindrome 
{
	public static boolean palindrome(String s)
	{
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		if(s1.equals(s))
		{
			return true;
		}
		return  false;
	}
	public static void check(String s)
	{
		if(palindrome(s))
        {
        	System.out.println(s);
        }
        else
        {
        	String ans="";
        	for(int i=0;i<s.length();i++)
        	{
        		String s2="";
        		for(int j=i+1;j<s.length();j++)
        		{
        			s2=s2+s.charAt(j);
        			if(palindrome(s2))
        			{
        				if(ans.length()<s2.length())
        				{
        					ans=s2;
        				}
        			}
        		}
        	}
        	if(ans.length()==0)
        	{
        		System.out.println("No palindrome");
        	}
        	else
        	{
        		System.out.println(ans);
        	}
        }
	}
	public static void main(String[] args) 
	{
        String s="nvebvhvbniovh[/?;koe";
        check(s);
	}
}

























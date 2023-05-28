package string;

public class Sum_of_Digit_In_String 
{
	public static void main(String[] args) 
	{
      int sum=0;
      String s= "hello123 hi8";
      for(int i=0;i<s.length();i++)
      {
    	  char c=s.charAt(i);
    	  if(c>='0' && c<='9')
    	  {
    		  sum=sum+(c-48);
    	  }
      }
      System.out.println(sum);
	}
}

package string;

public class Sum_of_3_Digit_of_String 
{
	public static void main(String[] args) 
	{
       String s="hello 500 bye 850 hi 140 ok 600";
       int sum=0;
       String [] s1=s.split(" ");
       for( String ele : s1)
       {
    	   //System.out.println(ele+"-->"+ele.charAt(0));
    	   if(ele.charAt(0)>='0' && ele.charAt(0)<='9')
    	   {
    		   int n= Integer.parseInt(ele);
    		   sum=sum+n;
    	   }
       }
       System.out.println(sum);
	}
}

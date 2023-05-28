package string;

public class Repetede_Words_in_String 
{
	public static void main(String[] args) 
	{
       String s="hello hi bye hi hello hi hi";
       String [] s1=s.split(" ");
       String [] s2=s.split(" ");
       for(int i=0;i<s1.length;i++)
       {
    	   int c=0;
    	   for(int j=0;j<s2.length;j++)
    	   {
    		   if(s1[i].equals(s2[j]))
    		   {
    			  c++;
    			  s2[j]=" ";
    		   }
    	   }
    	   if(c>0)
    	   {
    		   System.out.println(s1[i]+"-->"+c);
    	   }
       }
	}
}

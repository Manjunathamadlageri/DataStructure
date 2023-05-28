package string;

import java.util.LinkedHashMap;

public class Contains_Alphabetes_or_not 
{
	public static void main(String[] args) 
	{
      String s="zxcvbnm,.;lkjhgfdsaqwer5tyuiopAsL*&";
      s=s.toLowerCase();
      LinkedHashMap l = new  LinkedHashMap();
      for(int i=0;i<s.length();i++)
      {
    	  if(s.charAt(i)>='a' && s.charAt(i)>='z')
    	  {
    		  l.putAll(l);
    	  }
      }
      if(l.size()==26)
      {
    	  System.out.println("All Chars");
      }
      else
      {
    	  System.out.println("Not all char");
      }
	}

}

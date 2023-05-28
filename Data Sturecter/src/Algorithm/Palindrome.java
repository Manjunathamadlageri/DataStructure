package Algorithm;
/**
 * 
 * @author manjunath
   Step 1:Start
   Step 2:Get the number to check for palindrome
   Step 3:Hold the number in temporary variable
   Step 4:Reverse the number
   Step 5:Compare the temporary number with reversed number
   Step 6:If both numbers are same
       print "palindrome number"
       Else 
       print "not palindrome number"
   Step 7:End/Stop
 */
public class Palindrome 
{
	public static void main(String args[])
	{  
		int r,sum=0,temp;    
		int n=454; 
		temp=n;    
		while(n>0)
		{    
			r=n%10; 
			sum=(sum*10)+r;    
			n=n/10;    
		}    
		if(temp==sum)    
			System.out.println("palindrome number ");    
		else    
			System.out.println("not palindrome");    
	}  
}

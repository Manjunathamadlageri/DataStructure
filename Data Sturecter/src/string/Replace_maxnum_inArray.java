package string;

public class Replace_maxnum_inArray 
{
	static void replace(int[]n)
	{
      int max=n[n.length-1];
      for(int i=n.length-1;i>=0;i--)
      {
    	  if(max>n[i])
    	  {
    		  n[i]=max;
    	  }
    	  else
    	  {
    		  max=n[i];
    	  }
      }
      for(int ele : n)
      {
    	  System.out.print(ele+" ");
      }
	}
	public static void main(String[] args) 
	{
		int arr[]= {12,45,71,20,63,89,22,7};
		replace(arr);
	}
}

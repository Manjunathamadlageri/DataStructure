package string;
//Replace the element by largest element towards its Right side if not replaced  return -1
public class Max_Replace_by_minusOne 
{
	public static void main(String[] args) 
	{
        int []a= {24,54,64,56,90,15,66,72,84,17,65,5};
        int max=a[a.length-1];
        for(int i=a.length-1;i>=0;i--)
        {
        	if(max>a[i])
        	{
        		a[i]=max;
        	}
        	else
        	{
        		max=a[i];
        		a[i]=-1;
        	}
        }
        for(int ele : a)
        {
        	System.out.println(ele);
        }
	}

}

package Algorithm;

public class binarysearch {
	public static void search(int []a,int val)
	{
		int beg=0,end=a.length-1,pos=-1;
		while(beg<end)
		{
			int mid=(beg+end)/2;
			
			if(a[mid] == val)
			{
				pos=mid;
				System.out.println(pos);
				break;
			}
			else if(a[mid]>val)
			{
				end=mid-1;
			}
			else 
			{
				beg=mid+1;
			}
		}
		System.out.println("not found");
	}
	public static void main(String[] args) {
       int a[]= {12,23,34,45,56,67,78,89,90,91,83};
       int value=23;
       search(a,value);
	}
}

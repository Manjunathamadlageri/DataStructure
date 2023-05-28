package Algorithm;
/**
 * @author manjunath
 *Algorithm of Binary Search
 *procedure Binary_Search(int [] a,int key)
   int low=0;
   int high=last index  value of array
		while x not found
	if high = low
	display x does not exists
	EXIT
	set mid = low +high/2
	if a[mid]<key
	set low = mid+1
	else if a[mid]>key
	set high=mid-1
	else if(a[mid]=key
	display x found at location mid
	End
	while end
	end procedure
 */
public class Binary_Search 
{
	static String binarySearch(int []a,int key)
	{
		int low=0;
		int high=a.length-1;
		while(high>low)
		{
			int mid=(high+low)/2;
			if(a[mid]==key)
			{
				return "Key Found at pos:"+mid;
			}
			else if(a[mid]>key)
			{
				high=mid-1;
			}
			else if(a[mid]<key)
			{
				low=mid+1;
			}
		}
		return "Key not Found ";
	}
	public static void main(String[] args) {
		int a[]= {10,23,34,45,65,76,79,88,99};
		int key=88;
		System.out.println(binarySearch(a,key));
	}
}

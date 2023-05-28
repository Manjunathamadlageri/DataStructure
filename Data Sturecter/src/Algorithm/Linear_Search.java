package Algorithm;
/**
 * @author manjunath
 * Algorithm of Linear Search
   Step 1:Start
   Step 2:if i>last index of array then go to step 7
   Step 3:if a[i]=x then go to step 6
   Step 4:set i to i+1
   Step 5:go to step 2
   Step 6:print element x found at index position and go to step 8
   Step 7:print element not found
   Step 8:End/Stop
 */
public class Linear_Search 
{
static String linearSearch(int a[],int key)
{
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==key)
		{
			return "Element Found at Pos:"+i;
		}
	}
	return "Element Not Found";
}
public static void main(String[] args) {
	int a[]= {89,65,10,23,34,45,65,76,79,88,99};
	int key=79;
	System.out.println(linearSearch(a,key));
}
}

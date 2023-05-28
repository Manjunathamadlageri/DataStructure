package Complexity;

public class bigO_N //Linear search program
{
public static void main(String[] args) 
{
	int n[]= {10,5,18,12,100};
	int key=12;
	int pos=-1;
	for(int i=0;i<n.length;i++)
	{
		if(key==n[i])
		{
			System.out.println("Index position of Key:"+i);
			pos=i;
			break;
		}
	}
	if(pos==-1)
	{
		System.out.println(-1);
	}
}
}

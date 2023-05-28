package com.sort;

public class Insertionsort {
	static int [] sort(int []n)
	{
		for(int i=1;i<n.length;i++)
		{
			int key = n[i];
			int j =i-1;
			while(j>=0 && n[j]>key)
			{
				n[j+1]=n[j];
				j=j-1;
			}
			n[j+1]=key;
		}
		return n;
	}
	public static void main(String[] args) {
		int [] n= {12,11,13,5,6};
		n=sort(n);
		for(int ele : n)
		{
			System.out.print(ele+" ");
		}
	}
}

package Algorithm;

import java.util.ArrayList;

public class count_lest_Currency 
{
	static int printAllSubsetsRec(int arr[],int n,ArrayList<Integer> v, int  sum)
	{
		if (sum == 0)
		{
			return (int)v.size();
		}

		if (sum < 0)
			return Integer.MAX_VALUE;

		// Condition when no
		// such sequence found
		if (n == 0)
			return Integer.MAX_VALUE;

		// Calling for without choosing
		// the current index value
		int x = printAllSubsetsRec(
				arr,
				n - 1, v, sum);

		// Calling for after choosing
		// the current index value
		v.add(arr[n - 1]);

		int y = printAllSubsetsRec(
				arr, n, v,
				sum - arr[n - 1]);
		v.remove(v.size() - 1);

		return Math.min(x, y);
	}

	//Function for every array
	static int printAllSubsets(int arr[],
			int n, int sum)
	{
		ArrayList<Integer> v = new ArrayList<>();
		return printAllSubsetsRec(arr, n, v, sum);
	}
	public static void main(String[] args)
	{
		int arr[] = { 2, 1, 4, 3, 5, 6 };
		int sum = 56;
		int n = arr.length;

		System.out.println(printAllSubsets(arr, n, sum));
	}
}

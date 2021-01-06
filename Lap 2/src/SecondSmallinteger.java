/*
 * @author:Vinoth Rajendran
 * desc:Create a method which accepts an array of integer elements and return the second smallest element in the array
 */
import java.util.*;
public class SecondSmallinteger {
	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	int arr[]= {5,3,8,6,9,0};
	int secondnum=getSecondSmallest(arr);
	System.out.print(secondnum);
	}
	private static int getSecondSmallest(int[] arr)
	{
		int str=arr.length;
		int temp=0;
		for(int i=0;i<str;i++ )
		{
			for(int j=i+1;j<str;j++)
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		return arr[1];
	}

}

/*
 * @author:Vinoth Rajendran
 * desc:Create a method that can accept an array of String objects and sort in alphabetical order. The elements in the left half should be completely in uppercase and the elements in the right half should be completely in lower case. Return the resulting array.
Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE

 */
import java.util.*;
public class sortAscending {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int val=5;
		String [] arr=new String[val];
		for(int i=0;i<val;i++)
			
		{
		arr[i]=sc.nextLine();
		}
		
		
Arrays.sort(arr);
int len=arr.length;
if(len%2==0)
{
	for(int i=0;i<len/2;i++)
	{
		System.out.println(arr[i].toUpperCase());
	}
	for(int i=len/2;i<len;i++)
	{
		System.out.println(arr[i].toLowerCase());
	}
}
else
{
	for(int i=0;i<(len/2)+1;i++)
	{
		System.out.println(arr[i].toUpperCase());
	}
	for(int i=(len/2)+1;i<len;i++)
	{
		System.out.println(arr[i].toLowerCase());
	}

}
	}
	}


//import java.util.*;
//public class sortAscending {
//	public static void main(String [] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		int val=5;
//		String [] arr=new String[val];
//		for(int i=0;i<val;i++)
//			
//		{
//		arr[i]=sc.nextLine();
//		}
//		String value=sortStrings(arr);
//	}
//	private static string sortStrings(String[] arr)
//	{
//	return 0;
//		
//Arrays.sort(arr);
//int len=arr.length;
//if(len%2==0)
//{
//	for(int i=0;i<len/2;i++)
//	{
//		System.out.println(arr[i].toUpperCase());
//	}
//	for(int i=len/2;i<len;i++)
//	{
//		System.out.println(arr[i].toLowerCase());
//	}
//}
//else
//{
//	for(int i=0;i<(len/2)+1;i++)
//	{
//		System.out.println(arr[i].toUpperCase());
//	}
//	for(int i=(len/2)+1;i<len;i++)
//	{
//		System.out.println(arr[i].toLowerCase());
//	}
//
//}
//	}
//	}































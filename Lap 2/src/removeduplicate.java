
/*
 * @author:Vinoth Rajendran
 * desc:Create a method which accepts an integer array and removes all the duplicates in the array. Return the resulting array in descending order
 */
import java.util.*;

public class removeduplicate {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	int val=sc.nextInt();
	int[] arr=new int[val];
	for(int i=0;i<val;i++)
	{
		arr[i]=sc.nextInt();
	}
	int [] mod=modifyArray(arr);
//	System.out.print(mod.length);
//	for(int i=0;i<mod.length;i++)
//	{
//		
//		System.out.println(mod[i]);
//	}
	
			
	}
private static int[] modifyArray(int[] arr)
{
	int[] stored=arr;
	int in=arr.length;
	int temp=0;
	for(int i=0;i<in;i++)
	{
		for(int j=i+1;j<in;j++)
		{
			if(stored[i]==stored[j])
			{
				stored[j]='*';
			}
			else	if(stored[i]>stored[j])
			{
				temp=stored[i];
				stored[i]=stored[j];
				stored[j]=temp;
			}
		}
		
	}
	//int ind=0,store[]=new int[1000];
	for(int i=0;i<in;i++)
	{
		if(stored[i]!='*')
		System.out.println(stored[i]);
			//store[ind]=stored[i];
		//ind++;
			//continue;
	}
	return stored;
}
}

/*
 * @author:Vinoth Rajendran
 * desc:Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order

 */

public class sortArray 
{
public static void main(String [] args) 
{
int[] arr= {34,56,21,10,59};


	

int len=arr.length;
int rem=0,rev=0;
int in=0;
int stored[]=new int[1000];
for(int i=0;i<len;i++)
{
	rev=0;
	while(arr[i]!=0)
	{
		rem=arr[i]%10;
		rev=(rev*10)+rem;
		arr[i]=arr[i]/10;
	}
	stored[in]=rev;
	in++;
}
int temp=0;
for(int i=0;i<in;i++)
{
	for(int j=i+1;j<in;j++)
	{
		if(stored[i]>stored[j])
		{
			temp=stored[i];
			stored[i]=stored[j];
			stored[j]=temp;
		}
	}
	
}
for(int i=0;i<in;i++)
{
	
	System.out.println(stored[i]);
}

}

}


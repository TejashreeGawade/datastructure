import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		int arr[] = {2,7,11,36,39,41,56};
		int n=arr.length;
		int first=0;
		int last=n;
		int mid;
		
		System.out.println("Enter the key element you wantto search:");
		int k=in.nextInt();
		
		while(first<last)
		{
			mid=(first+last)/2;
			if(arr[mid]==k)
			{
				System.out.println("You Found The Key On" +mid+"th Index");
			}
			else
			{
				if(k<arr[mid])
					last=mid-1;
				if(k>arr[mid])
					first=mid+1;

			}
		}
		if(first==last)
		{
		System.out.println("The Key is fond on "+first+"th Index");
		}
	}

}

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner in = new Scanner(System.in);
			int arr[] = {2,5,1,3,4};
			
			System.out.println("Enter the key you want to search:");
			int k=in.nextInt();
			int n=arr.length;
			System.out.println("Length Is:"+n);
			
			for(int i=0;i<n;i++)
			{
				int temp=arr[i];
				if(k==temp)
					System.out.println("The key is" +" "+k+ "Found At" + " " +i+ " "+ "Index");
			}

	}

}

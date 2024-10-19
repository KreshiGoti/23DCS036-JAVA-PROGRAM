import java.util.Scanner;

class Pra8
{
public static void main(String args[])
{
         System.out.println("enter array size");
	 Scanner sc = new Scanner(System.in);
 	 int n = sc.nextInt();
	 int[] arr = new int[n];
	
	 System.out.println("enter array elements:");
	 for(int i=0; i<n;i++)
	{
	 System.out.println("for"+i);
	 arr[i]=sc.nextInt();
	}
	findnum(arr);
	}

	static void findnum(int[] arr)
	{
	int ab=0;
	 for(int i=0;i<arr.length;i++)
	{
	 if(arr[i]==9)
	{
	 ab++;
	}
	}
	System.out.println("number 9 is found in array is"+ab);
         System.out.println("23DCS036_kreshi_goti");
	}
};

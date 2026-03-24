import java.util.Scanner;
public class Fibonacci
{
	public static void main(String[] args)
	{
		System.out.println("Enter no of terms");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int first=0;
		int second=1;
		System.out.println("The Fibonacci series upto given terms are: ");
		for(int i=1;i<=n;++i)
		{
		System.out.print(first + " ");
		int next=first+second;
		first=second;
		second=next;
		}

	}
}
import java.io.*;
class EvenOddFiles
{
	 public static void main(String[] args) throws IOException
	{
		int num[]={1,2,3,4,5,6,7,8,9,10};
		BufferedWriter evenfile=new BufferedWriter(new FileWriter("Even.txt"));
		BufferedWriter oddfile=new BufferedWriter(new FileWriter("Odd.txt"));
		for( int n:num)
		{
			if(n%2==0)
			{
				evenfile.write(n+ "\n");
			}
			else
			{
				oddfile.write(n+ "\n");
			}

		}
		evenfile.close();
		oddfile.close();
		System.out.println("Even and Odd Files are Generated");
	}
}
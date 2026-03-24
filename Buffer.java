import java.io.*;
class Buffer
{
	 public static void main(String[] args) throws IOException
	{
		int num[]={1,2,3,4,5,6,7,8,9,10};
		BufferedReader evenfile=new BufferedReader(new FileReader("Even.txt"));
		BufferedReader oddfile=new BufferedReader(new FileReader("Odd.txt"));
		for( int n:num)
		{
			if(n%2==0)
			{
				evenfile.read(n+ "\n");
			}
			else
			{
				oddfile.read(n+ "\n");
			}

		}
		evenfile.close();
		oddfile.close();
		System.out.println("Even and Odd Files are Generated");
	}
}
class MultiCatch
{
	public static void main(String args[])
	{
		try
		{
			int a[]=new int[5];
			a[10]=50;
			int x=10/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index error");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Aritmetic error");
		}
		catch(Exception e)
		{
			System.out.println("General Exception");
		}

	}
}
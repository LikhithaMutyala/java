class Prime
{
       public static void main(String[] args)
       {
            System.out.println("Prime Number drom 1 to 100 are: ");
	    for(int num=1;num<=100;num++)
	    {
                  if(num<2)
			{
                            continue;//skip 0 and 1
			}
	          boolean isPrime=true;
	          for(int i=2;i<=num/2;i++)
                  {
                         if(num%i==0)
                         {
                              isPrime=false;
                              break;
                          }
                   }
                  if(isPrime)
                  {
                         System.out.println(num+"");
                   }
	    }
       }
}

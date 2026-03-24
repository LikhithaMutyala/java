class StaticBlock
{
static int a=10,b;
static
{
b=a*4;
}
public static void main(String args[])
{
System.out.println("a is: " +a+ " b is: " +b);
}
}
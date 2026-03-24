class ThisExample
{
int a, b;
ThisExample()
{
    this(10,20);
}
ThisExample(int a, int b)
{
this.a = a;
this.b = b;
System.out.println(" a is " +a+ " b is " +b);
}
public static void main(String args[])
{
ThisExample te=new ThisExample();
}
}
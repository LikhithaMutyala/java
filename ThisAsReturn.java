class ThisAsReturn
{
int a, b;
ThisAsReturn()
{
    a=10;
    b=20;
}
ThisAsReturn get()
{
return this;
}
void display()
{
System.out.println(" a is " +a+ " b is " +b);
}
public static void main(String args[])
{
ThisAsReturn ta=new ThisAsReturn();
ta.get().display();
}
}
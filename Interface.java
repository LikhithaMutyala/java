public interface A
{
void display();
}
public interface A
{
void show();
}
public class Test implements A,B
{
public static void main(String[] args)
{
void display()
{
System.out.println("Interface A");
}
}
public static void main(String[] args)
{
void show()
{
System.out.println("Interface B");
}
}
}
class Interface
{
Test t=new Test();
t.display();
t.show();
}
}
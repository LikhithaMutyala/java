class Faculty
{
void show()
{
System.out.println("Faculty is a Parent class");
} 
}
class Student extends Faculty
{
void show()
{ 
System.out.println("Student is a Child class1");
} 
}
class Hod extends Student
{
void show()
{
super.show();
System.out.println("Student is a Child class2");
} 
}
class MultilevelinheritanceDynamicdispatch
{
public static void main(String[] args)
{
Faculty S = new Student();
Faculty H = new Faculty();
S.show();
H.show();
}
}
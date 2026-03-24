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
System.out.println("Student is a Child class");
} 
}
class Singleinheritance
{
public static void main(String[] args)
{
Student S = new Student();
S.show();
}
}
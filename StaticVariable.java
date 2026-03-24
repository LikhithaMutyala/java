class StaticVariable
{
int rollno;
String name;
static String clgname="AUS";
StaticVariable(int r, String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(" roll no: " +rollno+ " Name: " +name+ " Campus: " +clgname);
}

public static void main(String args[])
{
StaticVariable sv1=new StaticVariable(1,"Kavya");
StaticVariable sv2=new StaticVariable(2,"Likhitha");
sv1.display();
sv2.display();
}
}




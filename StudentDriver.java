import java.util.*;
class StudentDriver
{
public static void main(String args[])
{
ArrayList<Studentinfo> li = new ArrayList<>();
li.add(new Studentinfo(1, "Sneha"));
li.add(new Studentinfo(3, "Thanu"));
li.add(new Studentinfo(2, "Sweety"));
Collections.sort(li, new NameComparator());
System.out.println(li);
}
}
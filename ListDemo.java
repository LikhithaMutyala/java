import java.util.*;
class ListDemo
{
	public static void main(String args[])
	{
		LinkedList<Integer> li=new LinkedList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		System.out.println("Added elements into created List:" +li);
		//Read
		System.out.println("Get Specified Elements from List:" +li.get(2));
		//update
		li.set(0,4);
		System.out.println("Updated List:" +li);
		//Delete
		li.remove(1);
		System.out.println("After Deletion:" +li);

	}
}

/*import java.util.*;
class ListDemo
{
	public static void main(String args[])
	{
		ArrayList<String>li=new ArrayList<>();
		li.add("Srinu");
		li.add("Rama");
		li.add("Likhi");
		System.out.println(li);
	}
}*/

import java.util.*;
class TreeMapCRUD
{
	public static void main(String args[])
	{
		TashMap<Integer,String>tmap=new TreeMap<>();
		//create
		tmap.put(1,"Java");
		tmap.put(2,"C");
		tmap.put(3,"C++");
		//Read
		for(Map.Entry<Integer, String>entry:tmap.entrySet())
		{
			System.out.println(entry.getKey()+"--->"+entry.getValue());
		}
		//update
		tmap.put(2,"Python");
		System.out.println("After updating Key 2" +hmap.get(2));
		//delete
		tmap.remove(1);
		System.out.println(hmap);
	}
}
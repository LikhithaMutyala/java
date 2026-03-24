import java.util.*;
class MapCRUD
{
	public static void main(String args[])
	{
		HashMap<Integer,String>hmap=new HashMap<>();
		//create
		hmap.put(1,"Java");
		hmap.put(2,"C");
		hmap.put(3,"C++");
		//Read
		for(Map.Entry<Integer, String>entry:hmap.entrySet())
		{
			System.out.println(entry.getKey()+"--->"+entry.getValue());
		}
		//update
		hmap.put(2,"Python");
		System.out.println("After updating Key 2" +hmap.get(2));
		//delete
		hmap.remove(1);
		System.out.println(hmap);
	}
}
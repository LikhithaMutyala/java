import java.util.*;

class HashTableCRUD {
    public static void main(String args[]) {

        // Create Hashtable
        Hashtable<Integer, String> htable = new Hashtable<>();

        // Create (Insert)
        htable.put(1, "Java");
        htable.put(2, "C");
        htable.put(3, "C++");
        System.out.println("After Creation: " + htable);

        // Read
        System.out.println("Reading Elements:");
        for (Map.Entry<Integer, String> entry : htable.entrySet()) {
            System.out.println(entry.getKey() + " ---> " + entry.getValue());
        }

        // Update
        if (htable.containsKey(2)) {
            htable.put(2, "Python");
            System.out.println("After Updating Key 2: " + htable);
        }

        // Delete
        htable.remove(1);
        System.out.println("After Deletion of Key 1: " + htable);
    }
}
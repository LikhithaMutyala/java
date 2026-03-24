import java.util.*;

class TreeSetCRUD {
    public static void main(String args[]) {
        
        TreeSet<String> ts = new TreeSet<>();
        
        // Create
        ts.add("India");
        ts.add("South Africa");
        ts.add("Russia");
        System.out.println("After Adding: " + ts);
        
        // Read
        System.out.println("Read Elements from TreeSet: ");
        for(String s : ts) {
            System.out.println(s);
        }
        
        // Update
        ts.remove("Russia");
        ts.add("UK");
        System.out.println("Updated set: " + ts);
        
        // Delete
        ts.remove("South Africa");
        System.out.println("After Deletion: " + ts);
    }
}
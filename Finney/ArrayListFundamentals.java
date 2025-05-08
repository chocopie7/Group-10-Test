package Finney;


import java.util.ArrayList;

public class ArrayListFundamentals {

    public static void main(String[] args) {
   
        
        // Create ArrayList (dynamically sized)
        ArrayList<String> cities = new ArrayList<>();
        
        // 7.2 Methods demonstration
        System.out.println("=== Core ArrayList Methods ===");
        
        // add()
        cities.add("Paris");       // Add to end
        cities.add("London");
        cities.add(1, "Berlin");  // Add at index 1
        printList("After adding elements:", cities);
        
        // get() and size()
        System.out.println("\nElement at index 0: " + cities.get(0));
        System.out.println("Current size: " + cities.size());
        
        // set() - update element
        cities.set(2, "Madrid");  // Replace index 2
        printList("\nAfter updating index 2:", cities);
        
        // remove()
        cities.remove(0);          // Remove by index
        cities.remove("London");   // Remove by object
        printList("\nAfter removing elements:", cities);
        
        // Dynamic sizing demonstration
        System.out.println("\n=== Dynamic Sizing ===");
        System.out.println("Initial capacity: " + cities.size());
        cities.add("Rome");
        cities.add("Amsterdam");
        System.out.println("New capacity after additions: " + cities.size());
        System.out.println("Final contents: " + cities); 
    }

    private static void printList(String message, ArrayList<String> list) {
        System.out.println(message);
        System.out.println("ArrayList contents: " + list);
        System.out.println("Current size: " + list.size());
    }
}
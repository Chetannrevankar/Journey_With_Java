import java.util.*;
public class CollectionQueue {
    public static void main(String[] args) {
        Queue<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        
        System.out.println(fruits.poll()); // Output: Apple (removed first)
        System.out.println(fruits);         // Remaining: [Banana, Mango]       }}

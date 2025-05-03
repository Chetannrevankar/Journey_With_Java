import java.util.*;
public class CollectionSet {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // duplicate ignored
        System.out.println(fruits);  // Output: [Apple, Banana] (order not guaranteed)  }}

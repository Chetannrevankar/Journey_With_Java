import java.util.*;
import java.util.stream.*;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Chetan", "Arun", "Divya", "Anil");

        names.stream()                  // Create a stream
             .filter(name -> name.startsWith("A"))  // Filter names starting with A
             .sorted()                  // Sort the names
             .forEach(System.out::println);  // Print each name
    }
}

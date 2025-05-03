public class TypeConversionExample {
    public static void main(String[] args) {

        // Implicit Type Conversion (Widening)
        int num1 = 100;
        double result1 = num1;  // int → double
        System.out.println("Implicit Conversion (int to double): " + result1);

        // Explicit Type Conversion (Narrowing)
        double num2 = 45.67;
        int result2 = (int) num2;  // double → int (requires casting)
        System.out.println("Explicit Conversion (double to int): " + result2);
    }
}

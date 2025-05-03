class MethodOverloading_Calculator{
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(double a, double b) {
        System.out.println(a + b);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading_Calculator calc = new MethodOverloading_Calculator();
        calc.add(2, 3); // Calls the int version
        calc.add(2.0, 3.0); // Calls the double version
    }
}

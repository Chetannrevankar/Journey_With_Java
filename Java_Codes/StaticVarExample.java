public class StaticVarExample {
    static String college = "RNSIT";  // Static variable
    String name;

    StaticVarExample(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " studies at " + college);
        System.out.println();
    }

    public static void main(String[] args) {
        StaticVarExample s1 = new StaticVarExample("Chetan");
        StaticVarExample s2 = new StaticVarExample("Syed");

        s1.display();  // Output: Chetan studies at RNSIT
        s2.display();  // Output: Syed studies at RNSIT

        StaticVarExample.college = "RVCE";  // Changing static variable

        s1.display();  // Output: Chetan studies at RVCE
        s2.display();  // Output: Syed studies at RVCE
    }
}

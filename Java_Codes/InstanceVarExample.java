public class InstanceVarExample {
    int number = 25;  // Instance variable

    void show() {
        System.out.println("Instance Variable: " + number);
    }

    public static void main(String[] args) {
        InstanceVarExample obj1 = new InstanceVarExample();
        InstanceVarExample obj2 = new InstanceVarExample();
        obj2.number = 50;  // Changing for obj2

        obj1.show();  // Output: 25
        obj2.show();  // Output: 50
    }
}

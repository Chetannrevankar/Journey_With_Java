class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}


public class MethodOverRiding {
    public static void main(String[] args) {
        Animal obj = new Animal();
        Animal obj1 = new Dog();
        obj.sound();
        obj1.sound();
    }
}

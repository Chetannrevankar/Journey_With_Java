// Parent class (Super class)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");   }}

// Child class (Sub class) 1
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");          }}

// Child class (Sub class) 2
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");       }}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat class
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.eat();  // Inherited from Animal
        myDog.bark(); // Defined in Dog

        myCat.eat();  // Inherited from Animal
        myCat.meow();              }}

class Animal{
    void eat(){
        System.out.print("This Animal eats Food...!");          }}   
class Dog extends Animal{
    void bark(){
        System.out.println("The Dog is Barking...!");           }}
  
public class Inheritance
{
	public static void main(String[] args) {
		Dog animal = new Dog();
		animal.eat();
		System.out.println();
		animal.bark();                                              }}


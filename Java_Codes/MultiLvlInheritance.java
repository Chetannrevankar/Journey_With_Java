class Animal{
    void eat(){
        System.out.print("This Animal eats Food...!");      }}   
class Dog extends Animal{
    void bark(){
        System.out.println("The Dog is Barking...!");       }}
class Huskey extends Dog{
    void looks(){
        System.out.println("The Huskey looks like a FOX...!");  }}
  
public class MultiLvlInheritance
{
	public static void main(String[] args) {
		Huskey animal = new Huskey();
		animal.eat();
		System.out.println();
		animal.bark();
		animal.looks();                     }}

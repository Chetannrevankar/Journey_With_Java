interface Vehicle{
    void start();
    void stop();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("Car is Starting...!");
    }
    public void stop(){
        System.out.println("Car is Stoping...!");
    }
}

class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike is Starting...!");
    }
    public void stop(){
        System.out.println("Bike is Stoping...!");
    }
}

public class InterfaceExample {
    public static void main(String args[]) {
        Car car = new Car();
        car.start();
        car.stop();

        System.out.println();

        Bike bike = new Bike();
        bike.start();
        bike.stop();
    }}


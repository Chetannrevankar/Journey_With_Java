class Phone{
    String brand;
    String model;
    
    Phone(String a , String b){     //Constuctor
        brand = a;                  //Initializing instance var 
        model = b;
    }
    public void makeCall_Method(){
        System.out.println("Making Call With" +" "+ brand + " " + model);
    }
}
public class Constructor_Method{
    public static void main(String args[]){
        Phone nokia = new Phone("Nokia a15","to Chetan");
        nokia.makeCall_Method();
    }
}
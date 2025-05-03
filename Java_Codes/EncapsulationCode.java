class Encapsulation{
    private String name;
    private int age;
    
    public String getname(){
        return name;        }
    
    public void setname(String n){
        name = n;                   }
    public int getage(){
        return age;     }
    
    public void setage(int a){
        age = a;                }}
public class EncapsulationCode{
    public static void main(String args[]){
        Encapsulation obj = new Encapsulation();
        obj.setname("Chetan");
        obj.setage(25);
        
        System.out.println(obj.getname()+":"+obj.getage());         }}
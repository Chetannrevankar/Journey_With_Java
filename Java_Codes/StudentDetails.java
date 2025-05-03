class StudentDetail{
    String name;
    int rollnumber;
    int marks;
    
    StudentDetail(String a,int b,int c){
        name = a;
        rollnumber = b;
        marks = c;
    }
    void displayinfo(){
        System.out.println("Student Name :" + name);
        System.out.println("Student RollNumber :" + rollnumber);
        System.out.println("Student Totalmarks :" + marks);
        System.out.println();
        
        
    }
}
public class StudentDetails{
    public static void main(String args[]){
        StudentDetail s1 = new StudentDetail("Chetan" , 1 , 70);
        StudentDetail s2 = new StudentDetail("Syed" , 2 , 70);
        StudentDetail s3 = new StudentDetail("Raghu" , 3 , 70);
        
        s1.displayinfo();
        s2.displayinfo();
        s3.displayinfo();
    }
}
class Student{
    int rollno;
    String name;
    int marks;
}
public class StudentArray{
    public static void main(String args[]){
        Student s1=new Student();
        s1.rollno=1;
        s1.name="Chetan";
        s1.marks=10;
        
        Student s2=new Student();
        s2.rollno=2;
        s2.name="Syed";
        s2.marks=12;
        
        Student s3=new Student();
        s3.rollno=3;
        s3.name="Raghu";
        s3.marks=9;
        
        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        System.out.println("Name" + " " + "Rollno" + " " + "Marks");
        System.out.println();
        
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name+" : "+students[i].rollno+" : "+students[i].marks);
        }
        
        
    }
}
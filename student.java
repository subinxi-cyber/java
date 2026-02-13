import java.util.Scanner;
public class Student
{
   int rollno,m1,m2,m3;
   String name;
   int total;
   float average;
   void getdata()
   {
          Scanner scan = new Scanner(System.in);
          System.out.println("enter student name,rollno,and mark of 3 subject:");
          name =scan.nextLine();
          rollno=scan.nextInt();
          m1=scan.nextInt();
          m2=scan.nextInt();
          m3=scan.nextInt();
   }
    void cal()
    {
        total=m1+m2+m3;
        average = total / 3.0f;
        System.out.println("Total marks:"+total);
        System.out.println("Averege:"+average);
    }

    public static void main(String[] args)
    {
        Student s = new Student();
        s.getdata();
        s.cal();
    }
}
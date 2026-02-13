import java.util.Scanner;
public class FacultyInput
{
    int age;
    String fname;
    void getData()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Faculty Name:");
        fname=scan.nextLine();
        System.out.println("Enter age:");
        age=scan.nextInt();
    }
    void display()
    {
        System.out.println("Faculty Name:"+fname);
        System.out.println("Age:"+age);
    }
    public static void main(String[] args) 
    {
      FacultyInput f = new FacultyInput();
      f.getData();
      System.out.println("Faculty Details");
      System.out.println("===============");   
      f.display(); 
    }
}
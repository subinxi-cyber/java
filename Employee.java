public class Employee
{
  String empname;
  int empno;
  Employee(String n,int a)
  {
    empname=n;
    empno=a;
  }   
  void display()
  {
    System.out.println("Employee Details!!");
    System.out.println("-------------------");
    System.out.println("Employee name:"+empname);
    System.out.println("Employee number:"+empno);
        
  }
  public static void main(String args[])
  {
    Employee e=new Employee("anu",12);
    e.display();
  }
}

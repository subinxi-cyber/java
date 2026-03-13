import java.util.Scanner;

class Employee
{
    int empid;
    String name,adress,subject;
    double salary;

    Employee(int no,String na,double sal,String addr)
    {
        empid=no;
        name=na;
        salary=sal;
        adress=addr;
    }
}

class Teacher extends Employee 
{ 
   String dept,sub;

   Teacher(int no,String na,double sal,String addr,String dep,String sub)
   {
    super(no,na,sal,addr);
    dept=dep;
    subject=sub;
   }

   void display()
   {
    System.out.println("employee id:"+empid);
    System.out.println("name:"+name);
    System.out.println("salary:"+salary);
    System.out.println("adress:"+adress);
    System.out.println("department:"+dept);
    System.out.println("subject:"+subject);
   }
}

class EmpInheritance
{
    public static void main(String[] args)
    {
        System.out.println("\nenter the no of employees");
        Scanner s=new Scanner(System.in);

        int num = s.nextInt();
        Teacher arr[]= new Teacher[num];

        for(int i=0;i<num;i++)
        {
            System.out.println("\nEnter Employee-"+(i+1)+" details:id,Employee Name,Salary,Adress,Department,subject");

            int empid=s.nextInt();
            String name=s.next();
            double salary=s.nextDouble();
            String adress=s.next();
            String dept=s.next();
            String subject=s.next();

            arr[i]= new Teacher(empid, name, salary, adress, dept, subject);
        }

        System.out.println("\n**information of all the employee**");

        for(int i=0;i<num;i++)
        {
            System.out.println("\nEmployee="+(i+1)+" DETAILS");
            System.out.println("-----------------");
            arr[i].display();
        }

        s.close();
    }
}
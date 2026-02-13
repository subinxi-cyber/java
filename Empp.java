import java.util.Scanner;
public class Empp 
{
    int empid;
    String empname;
    int TA,DA,HRA,tax,basic,netsal;
    void getData()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Employee name:");
        empname=scan.nextLine();
        System.out.println("Enter the Empid:");
        empid=scan.nextInt();
        System.out.println("Enter TA:");
        TA=scan.nextInt();
        System.out.println("Enter DA:");
        DA=scan.nextInt();
        System.out.println("Enter HRA:");
        HRA=scan.nextInt();
        System.out.println("Enter TAX:");
        tax=scan.nextInt();
        System.out.println("Enter Basic:");
        basic=scan.nextInt();
    }
    void calc()
    {
        netsal=(basic+TA+DA+HRA)-tax;
        System.out.println("Net Salary:"+netsal);
    }
    public static void main(String args[])
    {
        Empp e=new Empp();
        e.getData();
        System.out.println("Employee Details");
        System.out.println("================"); 
        System.out.println(" Empid:"+e.empid);
        System.out.println(" Employee Name:"+e.empname);
        e.calc();  
    }
}

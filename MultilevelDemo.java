import java.util.Scanner;

class person {
    String pname, address, gender;
    int age;

    person(String pname1, String address1, String gender1, int age1) {
        pname = pname1;
        address = address1;
        gender = gender1;
        age = age1;
    }
}

class Employee extends person {
    String emp_id, cp_name, qualification;
    float salary;

    Employee(String pname, String address, String gender, int age, String emp_id, String cp_name, String qualification,
            float salary) {
        super(pname, address, gender, age);
        this.emp_id = emp_id;
        this.cp_name = cp_name;
        this.qualification = qualification;
        this.salary = salary;

    }
}

class Teacher extends Employee {
    int teach_id;
    String department, subject;

    Teacher(int teach_id, String department, String subject, String emp_id, String cp_name, String qualification,
            float salary, String pname, String address, String gender, int age) {
        super(pname, address, gender, age, emp_id, cp_name, qualification, salary);
        this.teach_id = teach_id;
        this.department = department;
        this.subject = subject;

    }

    public void display() {
        System.out.println("Name:" + pname);
        System.out.println("Gender:" + gender);
        System.out.println("Address:" + address);
        System.out.println("Age:" + age);
        System.out.println("Employee ID :" + emp_id);
        System.out.println("Company Name:" + cp_name);
        System.out.println("Salary:" + salary);
        System.out.println("Qualification:" + qualification);
        System.out.println("Teacher ID:" + teach_id);
        System.out.println("Department:" + department);
        System.out.println("Subject" + subject);
    }
}

class MultilevelDemo {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of Employee:");
        int n = s.nextInt();
        Teacher empobj[] = new Teacher[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Employee " + (i + 1) + "deatils");
            System.out.println("--------------------------------");
            System.out.println("Name:");
            String pname = s.nextLine();
            System.out.println("Gender:");
            String gender = s.nextLine();
            System.out.println("Address");
            String address = s.nextLine();
            System.out.println("Age:");
            int age = s.nextInt();
            s.nextLine();
            System.out.println("Employee ID:");
            String emp_id = s.nextLine();
            System.out.println("Company Name:");
            String cp_name = s.nextLine();
            System.out.println("Salary:");
            float salary = s.nextFloat();
            s.nextLine(); 
            System.out.println("Qualification:");
            String qualification = s.nextLine();
            System.out.println("Teacher I D:");
            int teach_id = s.nextInt();
            s.nextLine();
            System.out.println("Department:");
            String department = s.nextLine();
            System.out.println("Subject taught:");
            String subject = s.nextLine();
            empobj[i] = new Teacher(teach_id, department, subject, emp_id, cp_name, qualification, salary, pname,
                    address, gender, age);

        }
        System.out.println("Employee  Details");
        System.out.println("-----------------");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1));
            System.out.println("---------------");
            empobj[i].display();
        }
    }
}
import java.util.Scanner;
class Employee{
    private int empNo;
    private float salary;
    private String empName;
    static float totalSalary =0;

    Employee(int empNo, String empName, float salary){
        this.empNo = empNo;
        this.salary = salary;
        this.empName = empName;
        this.totalSalary = totalSalary+salary;

    }
    void show(){
        //totalSalary = totalSalary+salary;
        System.out.println("Employee number : "+empNo+"  Name:  "+empName+"  Salary : "+salary+"  Total Salary : "+totalSalary);
    }

   
}

public class TotSalary {
    public static void main(String args[]) {
        //Employee emp = new Employee();
        System.out.println("Enter number of employee : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<= n;i++){
            System.out.print("Enter salary of "+i+" & "+" Emplyee Name : ");
            int sal = sc.nextInt();
            String name = sc.next();
            Employee emp = new Employee(i, name, sal);
            emp.show();

        }

    }
}

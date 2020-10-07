import java.util.Scanner;
class Employee{
    int empId;
    String name;
    int salary;

    Employee(int empId, String name, int salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return empId+" "+name+" "+salary;
    }
}
class ToString{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Employee emp[] = new Employee[2];
        for(int i=0; i<2; i++){
            System.out.println("Enter value for : "+i);
            int k = sc.nextInt();
            String s = sc.next();
            int sa = sc.nextInt();
            Employee e = new Employee(k,s,sa);
            emp[i] = e;
        }

        for(Employee e : emp )
        System.out.println(e.toString());

    }
}

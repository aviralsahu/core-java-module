import java.util.Scanner;

class PersonDemo{
    private String name;
    private int age;

    PersonDemo(int age, String name){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println(name+"  "+age);
    }
}
public class Person {
    public static void main(String args[]){
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name = sc.next();
        PersonDemo p = new PersonDemo(18, name);
        p.display();

    }
}

import java.util.Scanner;
class Student{
    public String name;
    public int rollno;
    public int age;
    public int score;

    Student(){}
    void set(String name, int rollno, int age, int score){
        this.name = name;
        this.rollno = rollno;
        this.age = age;
        this.score = score;
    }
}
public class Student_40 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Student arr[] = new Student[10];
    for(int i=0;i<arr.length; i++){
        System.out.println("Enter name , rollno, age & score : ");
        String name = sc.next();
        int rollno = sc.nextInt();
        int age = sc.nextInt();
        int score = sc.nextInt();
        Student s = new Student();
        s.set(name, rollno,age, score);
        arr[i] = s;
    }
    for(Student a : arr){
      System.out.println("Name : "+ a.name+", Roll NO : "+a.rollno+", Age : "+a.age+", Score : "+a.score);
    }

    System.out.println("Score Group [0-50] : ");
	    for(int i =0 ; i<arr.length; i++){
	        if(arr[i].score < 50.00 )
	            System.out.println("Name : "+arr[i].name+", Roll : "+arr[i].rollno+", Age : "+arr[i].age+", Score : "+arr[i].score);
	    }
    System.out.println("Score Group [0-50] : ");
   // System.out.println("Score Group [0-50] : ");
    for(int i =0 ; i<arr.length; i++){
        if(arr[i].score < 50.00 )
            System.out.println("Name : "+arr[i].name+", Roll : "+arr[i].rollno+", Age : "+arr[i].age+", Score : "+arr[i].score);
    }
    System.out.println("Score Group [50-65] : ");
    for(int i =0 ; i<arr.length; i++){
        if(arr[i].score >= 50.00 && arr[i].score < 65.00 )
            System.out.println("Name : "+arr[i].name+", Roll : "+arr[i].rollno+", Age : "+arr[i].age+", Score : "+arr[i].score);
    }
    System.out.println("Score Group [65-80] : ");
    for(int i =0 ; i<arr.length; i++){
        if(arr[i].score >= 65.00 && arr[i].score < 80.00 )
            System.out.println("Name : "+arr[i].name+", Roll : "+arr[i].rollno+", Age : "+arr[i].age+", Score : "+arr[i].score);
    }
    System.out.println("Score Group [80-100] : ");
    for(int i =0 ; i<arr.length; i++){
        if(arr[i].score >= 80.00 && arr[i].score <= 100.00 )
            System.out.println("Name : "+arr[i].name+", Roll : "+arr[i].rollno+", Age : "+arr[i].age+", Score : "+arr[i].score);
    }
   

}
}

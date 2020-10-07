import java.util.Scanner;
class Day2_15
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Gender : ");
        char g = sc.next().charAt(0);
        System.out.print("Enter your Age : ");
        int age = sc.nextInt();
        if( g=='f' && age > 18)
            System.out.println("You are eligible for the marriage!");
        else if ( g=='m' && age > 22)
            System.out.println("You are eligible for the marriage!");
        else
            System.out.println("You are not eligible for the marriage!");
       
    }
}

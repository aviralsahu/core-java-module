import java.util.Scanner;
class Day2_7
{
 public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
   int c=sc.nextInt();
   int d=sc.nextInt();
   int e=sc.nextInt();
   int sum = a+b+c+d+e;
   int perc =sum/5;

   System.out.println(" percentage marks = " + perc + "%");

}
}

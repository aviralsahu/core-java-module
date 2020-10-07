import java.util.Scanner;
class Day2_13
{
   public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int a,b,c;
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
     
     if(a>b && a>c)
      System.out.println("The greatest number is : " + a );
     else if(b>a && b>c)
      System.out.println("The greatest number is : " + b );
     else
      System.out.println("The greatest number is : " + c );
    }
}

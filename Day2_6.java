import java.util.Scanner;
    class Day2_6
    {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the radius : ");
            float i = sc.nextFloat();
            float area = (float)(3.14 * i * i);
            float cir = (float)(2 * 3.14 * i);
            System.out.println("Area of " +i+ " is : "+area+ "\nCircumference of "+i+ " is : "+cir);
        }
    }

import java.util.Scanner;
    class Day2_10
    {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the temperature in fahrenheit : ");
            float f = sc.nextFloat();
            float c = (float)(5*(f-32)/9);
            System.out.println("Temperature in celsius : "+c);
        }
    }

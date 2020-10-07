import java.util.Scanner;
    class Day2_14
    {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int y = sc.nextInt();
            if (y%100 !=0 && y%4 == 0 || y%400 == 0)
                System.out.println(y+" is leap year ");
            else
                System.out.println(y+" is not A leap year ");
        }
    }

import java.util.Scanner;
class Day3_20
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int flag=0;
        for (int i = a; i <= b; i++) { 
            if (i == 1 || i == 0) 
                continue; 
            flag = 1; 
  
            for (int j = 2; j <= i / 2; ++j) { 
                if (i % j == 0) { 
                    flag = 0; 
                    break; 
                } 
            } 
            if (flag == 1) 
                System.out.print(i+" "); 
        } 

    }
}

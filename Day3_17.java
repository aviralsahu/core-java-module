import java.util.Scanner;
class Day3_17
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to reverse : ");
        int num=sc.nextInt(); // let's say 123
        int k = num;
        int sum=0;
        int rem=0;
        while(num>0){
            rem = num%10;
            sum = sum*10;
            sum = rem+sum;
            num = num/10;
        }
        System.out.println("Reverse of "+k+" is : "+sum);

    }
}

import java.util.Scanner;

public class Day4_27
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0 ; i < a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		int max = a[0];
		int min = a[0];
		
		for(int i : a) {
			if (i > max) {
				max = i;
			}
			
			if(i < min) {
				min = i ;
			}
		}
		
		System.out.println("Maximum : "+max);
		System.out.println("Minimum : "+min);

	}

}

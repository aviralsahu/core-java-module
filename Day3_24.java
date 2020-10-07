import java.util.Scanner;

public class Day3_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int ar[] = new int[n];
		for(int i = 0 ; i < ar.length ;i++) {
			System.out.println("Insert "+(i+1)+" element : ");
			ar[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element you want to search : ");
		int s = sc.nextInt();
		int f = 0 ;
		for(int i :ar) {
			if(i == s) {
				f = 1;
				break;
			}
		}
		
		if(f==1) {
			System.out.println("Element found");
			
		}else {
			System.out.println("Element not Found");
		}

	}

}

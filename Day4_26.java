import java.util.*;

public class Day4_26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int rows = sc.nextInt();
		int arr[][] = new int[rows][];
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("Enter col for row "+i+" : ");
			int col = sc.nextInt();
			arr[i] = new int[col];
			for(int j = 0 ; j < arr[i].length ; j++ ) {
				System.out.println("Enter the element : ");
				arr[i][j] = sc.nextInt();
			}
		}
		
	
		int sum = 0 ;
		for(int ar[] :arr) {
			for(int e : ar) {
				System.out.print(" "+e);
				sum = sum+e;
			}
			System.out.println("");
		}
		
		System.out.println("Sum is : "+sum);

	}

}

package AssignPractice;

import java.util.Scanner;

interface StudentFee{
	int getFee();
}

public class Ques60 implements StudentFee {
	
	static String name;
	int fee;
	
	public static void main(String[] args) {
		System.out.println("Enter name : ");
		Scanner sc = new Scanner(System.in);
		Ques60 q = new Ques60();
		q.name = sc.next();
		q.fee = q.getFee();
		System.out.println("Name : "+q.name+" Fee : "+q.fee);
	}

	@Override
	public int getFee() {
		System.out.println("Enter the Fee : ");
		Scanner sc = new Scanner(System.in);
		fee = sc.nextInt();
		if(fee<0) {
			try {
				throw new Exception("InvalidFeeException");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}else {
		return fee;
		}
		return 0;
	}

}

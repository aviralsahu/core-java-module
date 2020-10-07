class Students{
	 private int rno;
	 private String name;
	 public static int count = 0;
	 
	 void setData(int rno , String name) {
		 this.rno = rno;
		 this.name=name;
		 count++;
	 }
	 
	 void showData() {
		  System.out.println("Student number :  "+count);
		 System.out.println(rno +"       --       "+name);
		 System.out.println("---------------------------------------");
	 }
	 
}
public class Day4_31 {

	public static void main(String[] args) {

		Students s1 = new Students();
		s1.setData(1, "cdacaish");
		s1.showData();
		
		Students s2 = new Students();
		s2.setData(2, "cdac");
		s2.showData();
		
		Students s3 = s1;
		s3.setData(3, "aish");
		s3.showData();

	}

}

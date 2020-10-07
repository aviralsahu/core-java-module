public class Rev {
    public static void main(String args[]){
        String str = "cdacaish cdac aish github git java";
        String[] arrOfStr = str.split(" "); 
        int size = arrOfStr.length;
        // for(int i=size; i>0; i--) {
        //    arr[i] = Integer.parseInt(arrOfStr[i]);
        // }
        for(int i=0; i<size; i++)
            System.out.print(arrOfStr[i]+" ");
            System.out.println();
        for(int i=size-1; i>=0; i--)
            System.out.print(arrOfStr[i]+" ");

    }
}

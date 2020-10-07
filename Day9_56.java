public class FirstC {
    public static void main(String[] args) {
        String str = "cdacaish cdac aish github git java";
        String[] arrOfStr = str.split(" ");
        int size = arrOfStr.length;

        for(int i=0; i<size; i++)
            System.out.println((Character.toUpperCase(arrOfStr[i].charAt(0)))+arrOfStr[i]);
        System.out.println();

    }
}

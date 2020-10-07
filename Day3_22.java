import java.util.Scanner;
class Day3_22
{
    public static void main(String args[])
    {
        int arr[] = new int[]{52,25,56,1,2,3,25,7,87,20};
        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
        

    }
}

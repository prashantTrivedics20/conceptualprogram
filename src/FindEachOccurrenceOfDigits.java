import java.util.Scanner;
public class FindEachOccurrenceOfDigits {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        System.out.println("Enter the digits");
        int n=readme.nextInt();
        int arr[]=new int[10];
        int r=0;
        int temp=n;
        while(temp>0)
        {
            r=temp%10;
            arr[r]++;
            temp=temp/10;
        }
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]!=0)
            {
                System.out.println(arr[i]);
            }
        }

    }

}

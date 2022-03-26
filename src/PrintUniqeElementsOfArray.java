import java.util.Scanner;
class PrintUniqueElementsOfArray {
    public static void frequency(int []arr)
    {
        int max=arr[0];
        for (int i = 0; i <arr.length; i++) {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        int fre[]=new int[max+1];
        for (int i = 0; i <arr.length; i++) {
            fre[arr[i]]++;
        }
        for (int i = 0; i <arr.length; i++) {
            if(fre[arr[i]]==1)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=readme.nextInt();
        }
        frequency(arr);
    }


}

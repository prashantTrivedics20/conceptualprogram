import java.util.Scanner;

public class GCDOFAnArray {
    // GCD of an array...
    // let you have an array
    // array=6,4,10,15
    static  int gcdOFTwo(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        if(b==0)
        {
            return a;
        }
        return gcdOFTwo(b,a%b);
    }
    static int gcdArray(int arr[])
    {
        if(arr.length<=1)
        {
            return arr[0];
        }
        int temp=arr[0];
            for (int i = 1; i <arr.length; i++) {
                temp=gcdOFTwo(temp,arr[i]);
            }
            return temp;
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=readme.nextInt();
        }
        System.out.println(gcdArray(arr));

    }


}

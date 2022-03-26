import java.util.Scanner;

public class checkPrimeNumber {
    int arr[];
    public checkPrimeNumber()
    {
        Scanner readme=new Scanner(System.in);
        int size=readme.nextInt();
        arr=new int[size];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=readme.nextInt();
        }
    }
    public boolean isPrimeChecker() {
        int f=0;
        for (int j = 0; j<arr.length; j++) {
            int c=0;
            for (int i = 1; i <=arr[j]; i++) {
                try {
                    if (arr[j] % i == 0) {
                        c++;
                    }
                } catch (Exception e) {
                }
            }
            System.out.println(c);
            if (c == 2) {
                f=1;
                break;
            }
        }
        if(f==1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        checkPrimeNumber obj=new checkPrimeNumber();
        System.out.println(obj.isPrimeChecker());
    }
}

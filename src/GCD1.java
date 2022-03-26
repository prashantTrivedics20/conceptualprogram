import java.util.Scanner;

public class GCD1 {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n1=readme.nextInt();
        int n2=readme.nextInt();
        int checker=0;
        if(n1<n2)
        {
            checker=n1;
        }
        else
        {
            checker=n2;
        }
        int result=0;
        for (int i = 1; i <=checker; i++) {
            if(n1%i==0&&n2%i==0)
            {
                result=i;
            }
        }
        System.out.println(result);


    }
}
//public boolean isPrime(int n)
//    {
//        int c=0;
//        for (int i = 1; i <=n; i++) {
//            if(n%i==0)
//            {
//                c++;
//            }
//        }
//        if(c==2)
//        {
//            return true;
//        }
//        return false;
//    }

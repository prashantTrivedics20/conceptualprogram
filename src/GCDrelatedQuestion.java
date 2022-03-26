import java.util.Scanner;
public class GCDrelatedQuestion {
    // GCD
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n1=readme.nextInt();
        int n2=readme.nextInt();
        int on1=n1;
        int on2=n2;
        while(n1%n2!=0)
        {
            int rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        int gcd=n2;
        int lcm=(n1*n2)/gcd;
        System.out.println("GCD is -> "+gcd);
        System.out.println("LCM is -> "+lcm);
    }
}

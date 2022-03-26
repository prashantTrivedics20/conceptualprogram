public class printStartingDigit {
    public static String check(int n,int k)
    {
        int i=1;
        int r=0,c=0;
        int t=n;
        int m=n;
        while(i<=k)
        {
            r=t%10;
            t=t/10;
            i++;
        }
        while(m>0)
        {
            c++;
            m=m/10;
        }
        int s=1;
        int l=0;
        while(s<=c-k+1)
        {
            l=n%10;
            n=n/10;
            s++;
        }
        return Integer.toString(l)+Integer.toString(r);
    }
    public static void main(String[] args) {
        int n=678152864;
        String s=check(n,5);
        System.out.println(s);// output should be=64

    }
}

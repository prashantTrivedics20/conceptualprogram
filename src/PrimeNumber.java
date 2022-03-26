import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
public class PrimeNumber {
    int arr[];
    public PrimeNumber()
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
            for (int i = 1; i <= arr[j]; i++) {
                try {
                    if (arr[j] % i == 0) {
                        c++;
                    }
                } catch (Exception e) {
                }
            }
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
    public boolean isPrime(int n)
    {
        int c=0;
        for (int i = 1; i <=n; i++) {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        PrimeNumber obj=new PrimeNumber();
        Queue<Object> que=new PriorityQueue<>();
        if(obj.isPrimeChecker())
        {
            int count=0;
            int sum=0;
            for (int i = 0; i < obj.arr.length; i++) {
                if(obj.isPrime(obj.arr[i]))
                {
                    count++;
                    sum=sum+obj.arr[i];
                }
                else
                {
                    que.add(count);
                    que.offer(sum);

                    count=0;

                    sum=0;
                    //obj.isPrime(obj.arr[i]);
                    //obj.isPrime(obj.arr[i]);
                }
            }
            System.out.println(que);
        }
        else
        {
            System.out.println("value is not exist");
        }
        //System.out.println("value is not exist");
    }
}

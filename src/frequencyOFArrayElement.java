import java.util.Scanner;
public class frequencyOFArrayElement {
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
        for (int i = 0; i <fre.length; i++) {
                if(fre[i]!=0)
                {
                    System.out.println(fre[i]);
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
// write a progam to find the each occrence of a given digit...
/*#include<stdio.h>
int main()
{
    int n,r,i;
    scanf("%d",&n);// 245664
    int f[10]={0};
    while(n>0)
    {
        r=n%10;
        f[r]++;
        n=n/10;
    }
    for(i=0;i<10;i++)
    {
        if(f[i]!=0)
        {
            printf(" elementposition=%d  is equal=%d\n",i,f[i]);
        }

    }
}*/



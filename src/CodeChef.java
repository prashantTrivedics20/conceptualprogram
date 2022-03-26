/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        for(int j=0;j<n;j++)
        {
            int t=readme.nextInt();

            String s=readme.next();
            Set<String>al=new LinkedHashSet();
            char arr[]=s.toCharArray();
            al.add(new String(s));
            for(int i=0;i<arr.length-2;i++)
            {
                if(i%2==0)
                {
                    char temp=arr[i];
                    arr[i]=arr[i+2];
                    arr[i+2]=temp;
                }

            }
            al.add(new String(arr));

            for(int i=0;i<arr.length-1;i++)
            {
                if(i%2==1)
                {
                    char temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            al.add(new String(arr));

            //  for(int i=0;i<arr.length;i++)
            //  {
            //      System.out.print(arr[i]);
            //  }
            //  System.out.println();
            ArrayList<Integer>ss=new ArrayList();
            ArrayList<String>alss=new ArrayList<>();
            for(String str:al)
            {
                alss.add(str);
            }
            for (int i = 0; i < alss.size(); i++) {
                String str=alss.get(i);
                int c=0;
                for(int k=0;k<str.length()-1;k++)
                {
                    if(str.charAt(k)=='0'&&str.charAt(k+1)=='1')
                    {
                        c++;
                    }

                }
                ss.add(c);
            }
            int max=0;
            for(int i=0;i<ss.size();i++)
            {
                if(max<ss.get(i))
                {
                    max=ss.get(i);
                }
            }
            System.out.println(max);

        }
    }
}

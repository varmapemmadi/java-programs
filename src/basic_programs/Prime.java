package basic_programs;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        for(int i=n;i<=n1;i++) {
           int  fc=0;
           for(int j=2;j<=i;j++)
           {
               if(i%j==0)
               {
                   fc++;
               }

           }
           if(fc==1)
           {
               System.out.println(i);
           }
        }
    }
}

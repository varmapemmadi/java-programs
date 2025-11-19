package basic_programs;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=n;
        int sum=0;
        int c=0;
        while(n!=0)
        {
            int d=n%10;
            n=n/10;
            c++;
        }
        n=r;
        while(n!=0)
        {
         int ro=n%10;
         sum= sum+(int) Math.pow(ro,c);
            n=n/10;
        }
        if(sum==r)
        System.out.println("Armstrong number");
        else
        System.out.println("Not Armstrong number");
    }
}

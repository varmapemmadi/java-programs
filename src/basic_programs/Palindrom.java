package basic_programs;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=n;
        int sum=0;
        while(n!=0)
        {
            int d=n%10;
            n=n/10;
            sum=sum*10+d;
        }
        if(sum==r)
        {
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("Not Palindrom");
        }
    }
}

package basic_programs;

import java.util.Scanner;

public class Fiboc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int a=0,b=1,c;
        System.out.print(a);
        for(int i=n;i<=n1;i++)
        {
            b=i+b;
            c=b;
            System.out.print(" "+c);
        }

    }
}

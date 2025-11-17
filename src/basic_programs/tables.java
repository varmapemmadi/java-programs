package basic_programs;

import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        for(int j=n;j<=n1;j++) {
            for (int i = 1; i <= 10; i++) {
               // System.out.print(j + " x " + i + " = " + (j * i)+" ");
                if(n<=n1)
                {
                   // System.out.print(j++ + " x " + i + " = " + (j++ * i)+" ");
                }
            }
             System.out.println();
        }
    }
}

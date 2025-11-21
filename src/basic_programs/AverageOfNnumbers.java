package basic_programs;

import java.util.Scanner;

public class AverageOfNnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int c=0;
        for(int a=1;a<=n;a++){
            sum=sum+a;
            c++;
        }
        System.out.print((float)sum/c);
    }
}

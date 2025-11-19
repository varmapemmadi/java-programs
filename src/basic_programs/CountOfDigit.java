package basic_programs;

import java.util.Scanner;

public class CountOfDigit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int c=0;
        while(n!=0)
        {
            int r=n%10;
            n=n/10;
            if(r==3)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}

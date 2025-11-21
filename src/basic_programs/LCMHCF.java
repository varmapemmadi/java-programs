package basic_programs;

import java.util.Scanner;

public class LCMHCF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1=sc.nextInt();
        int b=0;
        if(n>=n1)
            b=n;
        else{
            b=n1;
        }
        for(int i=2;i<=b;i++)
        {
            if(n%i==0 && n1%i==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}

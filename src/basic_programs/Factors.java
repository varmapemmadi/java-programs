package basic_programs;

import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int a=1;a<=n;a++){
          //  fact=fact*a;
            if(n%a==0){
                System.out.println(a+" ");
            }
        }
       // System.out.println(fact);
    }
}

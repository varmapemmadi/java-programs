package basic_programs;

import java.util.Scanner;

public class TakeUserInputsPrintLargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=0;
        while(true){
            int n=sc.nextInt();
            if(n==0)break;
            if(n>max){
                max=n;
            }

        }
        System.out.println(max);
    }
}

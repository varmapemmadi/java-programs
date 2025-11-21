package basic_programs;

import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sumOfPositive=0,sumOfNegative=0,sumOfOdd=0;
        while(true)
        {
            int n=sc.nextInt();
            if(n==0)
                break;
            else if(n>0)
            {
                if(n%2==0)
                {
                    sumOfPositive+=n;

                }else{
                    sumOfNegative+=n;
                }
            }
            else if(n<0)
            {
                sumOfNegative+=n;
            }
        }
        System.out.println(sumOfPositive +" "+sumOfNegative+" "+sumOfOdd);
    }
}

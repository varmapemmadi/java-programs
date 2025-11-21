package basic_programs;

import java.util.Scanner;

public class ArmstrongRange {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();

        for(int i=n;i<=n1;i++)
        {
            int tmp = i;
            int digits = 0;
            while (tmp != 0) {
                digits++;
                tmp /= 10;
            }

            tmp = i;
            int sum = 0;
            while (tmp != 0) {
                int d = tmp % 10;
                sum += Math.pow(d, digits);
                tmp /= 10;
            }

            if (sum == i) {
                System.out.println(i + " is an Armstrong number");
            }
        }
    }
}

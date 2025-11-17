package basic_programs;

import java.util.Scanner;

public class evenNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int c=0;
        for (int i = n; i <= m; i++) {
            if(i%2==0){
                c++;
                if(c==1)
                {
                    System.out.print(i);
                }
                else {
                    System.out.print(", " + i);
                }
            }
        }
        System.out.print(".");
    }
}

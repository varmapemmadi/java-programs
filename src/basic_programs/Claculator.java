package basic_programs;

import java.util.Scanner;

public class Claculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/') {

                int n = sc.nextInt();
                int n1 = sc.nextInt();
                if (op == '+') {
                    ans = n + n1;
                }
                if (op == '-') {
                    ans = n - n1;
                }
                if (op == '*') {
                    ans = n * n1;
                }
                if (op == '/') {
                    if (n1 != 0) {
                        ans = n / n1;
                    }
                }
            } else if (op == 'x' || op == 'X') {
                System.out.println("program exists");
                break;
            } else {
                System.out.println("invalid operators");
            }
            System.out.print(ans);
        }
    }
}

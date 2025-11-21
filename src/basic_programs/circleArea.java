package basic_programs;

import java.util.Scanner;

public class circleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Double pi=  Math.PI;
        System.out.println("The area of the circle is "+pi*(Math.pow(n,2)));
    }
}

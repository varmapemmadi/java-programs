package basic_programs;

import java.util.Scanner;

public class DiscountOfTheProduct {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sellingPrice = sc.nextInt();
        int discountPrice = sc.nextInt();
        double discountRate = sellingPrice-discountPrice;
        System.out.println((discountRate/sellingPrice)*100);
    }
}

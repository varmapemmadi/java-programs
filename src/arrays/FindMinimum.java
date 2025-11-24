package arrays;

import java.util.Scanner;

public class FindMinimum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minValue(arr));
    }
        static int minValue(int [] arr) {
            int min = arr[0];
            for (int i = 1; i <= arr.length - 1; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;
        }
}

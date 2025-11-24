package searching;

import java.util.Scanner;

public class LinearSearchWithString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);
        System.out.print(searchCharInString(str,c));
    }
        static int searchCharInString(String str,char c){
            char d;
            for (int i = 0; i < str.length(); i++) {
                d = str.charAt(i);
                if (c == d) {
                    return i;
                }
            }
            return -1;
        }

}

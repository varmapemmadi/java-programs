package basic_programs;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=s;
        String rev="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            rev=c+rev;
        }
        if(s1.equals(rev))
        {
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("Not Palindrom");
        }
    }
}

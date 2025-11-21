package basic_programs;

import java.time.Month;
import java.util.Scanner;

public class OnlyAllowInEvenDays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
      Month months=  Month.valueOf(name.toUpperCase());
      for(int i=1;i<=months.maxLength();i++)
      {
          if(i%2==0)
          {
              System.out.println(i+" ");
          }
      }
    //  System.out.println(months.maxLength());

    }
}

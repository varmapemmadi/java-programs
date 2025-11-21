package basic_programs;

import java.util.Scanner;

public class IsoscelesTriangle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

      //  int area= (int) (int) ((b/4)*(Math.sqrt(4)*Math.pow(a,2)-Math.pow(b,2)));
        double area = (b / 4.0) * Math.sqrt(4 * Math.pow(a, 2) - Math.pow(b, 2));
       // float c=1.5;
    //    double root=Math.sqrt(4);
    //    double area=c*(root*Math.pow(a,2)-Math.pow(b,2));

        System.out.println("The area of the isosceles is "+area);
    }
}

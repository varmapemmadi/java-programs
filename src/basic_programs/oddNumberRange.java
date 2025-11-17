package basic_programs;
import java.util.*;
public class oddNumberRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int c=0;
        for(int i=n;i<=n1;i++)
        {
            if(i%2!=0)
            {
                c++;
                if(c==1) {
                    System.out.print(i);
                }
                else{
                    System.out.print(", "+i);
                }
            }
        }
        System.out.print(".");
    }
}

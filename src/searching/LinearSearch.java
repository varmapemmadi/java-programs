package searching;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int target=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(linearSearch(arr,target));

    }
    static int linearSearch(int[] arr,int target)
    {
        if(arr.length==0)
            return -1;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]==target)
           return i;
       }
       return -1;
    }
}

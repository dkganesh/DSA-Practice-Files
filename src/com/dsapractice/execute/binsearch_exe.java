package com.dsapractice.execute;
import com.dsapractice.bin_search.bin_sch;
import java.util.Arrays;
import java.util.Scanner;

public class binsearch_exe {
    public static void main(String args[]){
        bin_sch o=new bin_sch();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no of Array Elements ...");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter the value to be serached ");
        int k=in.nextInt();
        Arrays.sort(a);
        System.err.println(o.search(a,k));
    }
}

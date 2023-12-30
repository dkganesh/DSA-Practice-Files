package com.dsapractice.execute;
import java.util.Arrays;
import com.dsapractice.sorting_Alogorithms.bubble_sort;
import java.util.Scanner;
public class bubblesort_exe {
    public static void main (String args[]){
        bubble_sort o=new bubble_sort();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no of Array Elements ...");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(o.sort(a)));
    }
}

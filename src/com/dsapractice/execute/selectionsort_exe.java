package com.dsapractice.execute;
import com.dsapractice.sorting_Alogorithms.selection_sort;

import java.util.Arrays;
import java.util.Scanner;

public class selectionsort_exe {
    public static void main(String args[]){
        selection_sort o=new selection_sort();
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

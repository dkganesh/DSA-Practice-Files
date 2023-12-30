package com.dsapractice.execute;

import java.util.Arrays;
import java.util.Scanner;

import com.dsapractice.sorting_Alogorithms.merge_sort;

public class mergesort_exe {

	public static void main(String[] args) {
		merge_sort o = new merge_sort();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of Array Elements ...");
		int n = in.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		System.out.println(Arrays.toString(o.sort(a)));

	}

}

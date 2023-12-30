package com.dsapractice.execute;

import java.util.Arrays;
import java.util.Scanner;

import com.dsapractice.sorting_Alogorithms.insertion_sort;

public class insertionsort_exe {

	public static void main(String args[]) {

		insertion_sort o = new insertion_sort();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of Array Elements ...");
		int n = in.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}

		int ans[] = o.sort(a);
		System.out.println(Arrays.toString(ans));
	}
}

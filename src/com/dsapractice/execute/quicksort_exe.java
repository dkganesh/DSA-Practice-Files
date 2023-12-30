package com.dsapractice.execute;

import java.util.Arrays;
import java.util.Scanner;
import com.dsapractice.sorting_Alogorithms.quick_sort;

public class quicksort_exe {
	public static void main(String[] args) {

		quick_sort o = new quick_sort();

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of Array Elements ...");
		int n = in.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}

		o.sort(a, 0, a.length - 1);

		System.out.println(Arrays.toString(a));

	}

}

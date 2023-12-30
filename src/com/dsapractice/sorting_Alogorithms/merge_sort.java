package com.dsapractice.sorting_Alogorithms;

import java.util.Arrays;

public class merge_sort {

	private int[] merger(int left[], int right[]) {
		int ans[] = new int[left.length + right.length];

		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] > right[j]) {
				ans[k++] = right[j++];
			} else
				ans[k++] = left[i++];
		}
		while (i < left.length)
			ans[k++] = left[i++];
		while (j < right.length)
			ans[k++] = right[j++];

		return ans;
	}

	public int[] sort(int[] a) {

		if (a.length == 1)
			return a;
		int left[] = sort(Arrays.copyOfRange(a, 0, a.length / 2));
		int right[] = sort(Arrays.copyOfRange(a, a.length / 2, a.length));

		return merger(left, right);

	}
}

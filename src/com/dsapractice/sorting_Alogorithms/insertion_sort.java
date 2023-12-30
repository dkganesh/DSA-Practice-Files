package com.dsapractice.sorting_Alogorithms;

public class insertion_sort {

	public int[] sort(int arr[]) {

		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j-1]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				} else
					break;
			}
		}

		return arr;
	}
}

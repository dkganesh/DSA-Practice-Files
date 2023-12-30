package com.dsapractice.sorting_Alogorithms;

public class quick_sort {
	public void sort(int a[], int low, int high) {
//		System.out.println("Started");
		if (low > high)
			return;
		int start = low, end = high;
		int mid = (start + end) / 2;
		int pivot=a[mid];

		while (start <= end) {
			while (pivot < a[end])
				end--;
			while (pivot > a[start])
				start++;
			if (start <= end) {
				int temp=a[end];
				a[end]=a[start];
				a[start]=temp;
				start++;end--;
			}
		}

		sort(a, low, end);
		sort(a, start, high);
//		System.out.println("Completed");
	}
}

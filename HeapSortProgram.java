package com.njit.cs610.sort;

/**
 * This is my HeapSort implemetation in Java.
 * 
 * @author ananyap
 *
 */
public class HeapSortProgram {

	private static int num;
	private long compCount = 0;

	public void sort(int arr[]) {

		long start_time = System.currentTimeMillis();

		heapify(arr);
		for (int i = num; i > 0; i--) {
			swap(arr, 0, i);
			num = num - 1;
			maxheap(arr, 0);
		}

		long end_time = System.currentTimeMillis();
		long total = end_time - start_time;
		System.out.println("\nNumber of comparision: " + compCount + " , Total Time Taken: " + total + " ms......");

	}

	/* Function to build a heap */
	public void heapify(int arr[]) {
		num = arr.length - 1;
		for (int i = num / 2; i >= 0; i--)
			maxheap(arr, i);
	}

	/**
	 * This method swaps largest element in heap.If parent is at index i, its
	 * left and right child will be at 2*i and 2*i + 1 indices respectively.
	 * 
	 * @param arr
	 * @param i
	 */
	public void maxheap(int arr[], int i) {
		int left = 2 * i;
		int right = 2 * i + 1;
		int max = i;
		if (left <= num && COMPARE_GREATER_THAN(arr[left], arr[i]))
			max = left;
		if (right <= num && COMPARE_GREATER_THAN(arr[right], arr[max]))
			max = right;

		if (max != i) {
			swap(arr, i, max);
			maxheap(arr, max);
		}
	}

	/**
	 * This method swaps two numbers in an array
	 * @param arr
	 * @param i
	 * @param j
	 */
	public static void swap(int arr[], int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	/**
	 * This method returns a boolean and increments the count.
	 * 
	 * @param i
	 * @param pivot
	 * @return
	 */
	private boolean COMPARE_GREATER_THAN(int i, int j) {
		compCount++;
		return i > j;
	}

}

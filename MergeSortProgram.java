package com.njit.cs610.sort;

/**
 * This is my MergeSort implemetation in Java.
 * @author ananyap
 *
 */
public class MergeSortProgram {

	// variable comparison counter
	private long compCount = 0;

	public void sort(int[] arr) {
		long start_time = System.currentTimeMillis();

		mergeSort(arr);

		long end_time = System.currentTimeMillis();
		long total = end_time - start_time;
		System.out.println("\nNumber of comparision: " + compCount + " , Total Time Taken: " + total + " ms......");
	}
	/**
	 * This method uses recursive mechanism for left and right arrays.
	 * @param arr
	 */
	private void mergeSort(int[] arr) {
		int n = arr.length;
		// return if array has zero or one element.
		if (n < 2) {
			return;
		}
		// find the middle
		int mid = n / 2;
		int[] left = new int[mid];
		int[] right = new int[n - mid];

		// populate the left array 0...mid
		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}

		// populate the right array mid...end
		for (int i = mid; i < n; i++) {
			right[i - mid] = arr[i];
		}
		mergeSort(left);
		mergeSort(right);
		merge(left, right, arr);

	}

	/**
	 * This method merges two arrays - left and right and puts into the result
	 * array. It first compares each elements of the left array with that of
	 * right one,updating the index and swapping the element.
	 * 
	 * @param left
	 * @param right
	 * @param arr
	 */
	private void merge(int[] left, int[] right, int[] arr) {
		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length) {
			if (COMPARE_LESS_THAN(left[i], right[j])) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			// increment the index of the result array.
			k = k + 1;
		}

		// copy left over elements in left array into the array
		while (i < left.length) {
			arr[k] = left[i];
			k++;
			i++;
		}

		// copy left over elements in right array into the array
		while (j < right.length) {
			arr[k] = right[j];
			k++;
			j++;
		}

	}

	/**
	 * This method returns a boolean and increments the count.
	 * 
	 * @param i
	 * @param pivot
	 * @return
	 */
	private boolean COMPARE_LESS_THAN(int i, int j) {
		compCount++;
		return i < j;
	}

}

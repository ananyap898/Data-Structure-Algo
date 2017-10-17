package com.njit.cs610.sort;

/**
 * This is my Quicksort implemetation in Java.
 * @author ananyap
 *
 */
public class QuickSortProgram {
	
	// variable comparison counter
	private long compCount = 0;
	
	/**
	 * This method sorts the array and determines total time spent.
	 * @param arr
	 */
	public void sort(int[] arr) {
		long start_time = System.currentTimeMillis();

		int start = 0;
		int end = arr.length - 1;
		quickSort(arr, start, end);

		long end_time = System.currentTimeMillis();
		long total = end_time - start_time;

		System.out.println("\nNumber of comparision: " + compCount + " , Total Time Taken: " + total + " ms......");

	}

	/**
	 * This method calls partition method and then recursively calls for each
	 * sub parts divided by the partition index.
	 * 
	 * @param arr
	 * @param start
	 * @param end
	 */

	private void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int pIndex = partition(arr, start, end);
			quickSort(arr, start, pIndex - 1);
			quickSort(arr, pIndex + 1, end);
		}
	}

	/**
	 * This method creates the partition;It initially takes last element as
	 * pivot and pIndex as start.Each element from the start is compared with
	 * pivot. This leads to swaping and incrementing pIndex(partition index).
	 * Finally,Value at pIndex is replaced with pivot.
	 * 
	 * @param arr
	 * @param start
	 * @param end
	 * @return
	 */
	private int partition(int[] arr, int start, int end) {

		int pivot = arr[end];
		int pIndex = start;

		for (int i = start; i <= end - 1; i++) {
			if (COMPARE_LESS_THAN_EQUALTO(arr[i], pivot)) {
				// swap arr[i] and arr[pIndex]
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;

				// increment pIndex index
				pIndex = pIndex + 1;
			}
		}
		// swap arr[pIndex] and arr[end],which has pivot.
		int temp = arr[pIndex];
		arr[pIndex] = arr[end];
		arr[end] = temp;

		return pIndex;
	}

	/**
	 * This method returns a boolean and increments the count.
	 * 
	 * @param i
	 * @param pivot
	 * @return
	 */
	private boolean COMPARE_LESS_THAN_EQUALTO(int i, int pivot) {
		compCount++;
		return i <= pivot;
	}

}

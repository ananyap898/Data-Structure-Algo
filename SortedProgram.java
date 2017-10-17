package com.njit.cs610.sort;

import java.util.Random;

public class SortedProgram {

	public static void main(String[] args) {
		
		int[] randomArray_32 = generateRandomArray(32);
		int[] randomArray_1024 = generateRandomArray(1024);
		int[] randomArray_32768 = generateRandomArray(32768);
		int[] randomArray_1048576 = generateRandomArray(1048576);
		int[] sortedArray_32 = sortedArray(32);
		int[] reverseSortedArray_32 = reverseArray(32);

		// Quick Sort cases 
		quickSortCases(randomArray_32, randomArray_1024, randomArray_32768, randomArray_1048576, sortedArray_32,
				reverseSortedArray_32);
		
		//Merge Sort Cases
		mergeSortCases(randomArray_32, randomArray_1024, randomArray_32768, randomArray_1048576, sortedArray_32,
				reverseSortedArray_32);
		
		//Heap Sort Cases
		heapSortCases(randomArray_32, randomArray_1024, randomArray_32768, randomArray_1048576, sortedArray_32,
				reverseSortedArray_32);

	}

	private static void quickSortCases(int[] randomArray_32, int[] randomArray_1024, int[] randomArray_32768,
			int[] randomArray_1048576, int[] sortedArray, int[] reverseSortedArray) {

		System.out.println("\n************************QUICK SORT BEGINS********************************** ");

		QuickSortProgram quickSortProgram1 = new QuickSortProgram();
		quickSortProgram1.sort(randomArray_32);
		printArray(randomArray_32, "QUICK");

		QuickSortProgram quickSortProgram2 = new QuickSortProgram();
		quickSortProgram2.sort(randomArray_1024);

		QuickSortProgram quickSortProgram3 = new QuickSortProgram();
		quickSortProgram3.sort(randomArray_32768);

		QuickSortProgram quickSortProgram4 = new QuickSortProgram();
		quickSortProgram4.sort(randomArray_1048576);

		QuickSortProgram quickSortProgram5 = new QuickSortProgram();
		quickSortProgram5.sort(sortedArray);
		printArray(sortedArray, "QUICK");

		QuickSortProgram quickSortProgram6 = new QuickSortProgram();
		quickSortProgram6.sort(reverseSortedArray);
		printArray(reverseSortedArray, "QUICK");

		System.out.println("\n************************QUICK SORT ENDS********************************** ");
	}

	private static void mergeSortCases(int[] randomArray_32, int[] randomArray_1024, int[] randomArray_32768,
			int[] randomArray_1048576, int[] sortedArray, int[] reverseSortedArray) {

		System.out.println("\n************************MERGE SORT BEGINS********************************** ");

		MergeSortProgram mergeSortProgram1 = new MergeSortProgram();
		mergeSortProgram1.sort(randomArray_32);
		printArray(randomArray_32, "MERGE");

		MergeSortProgram mergeSortProgram5 = new MergeSortProgram();
		mergeSortProgram5.sort(sortedArray);
		printArray(sortedArray,"MERGE");

		MergeSortProgram mergeSortProgram6 = new MergeSortProgram();
		mergeSortProgram6.sort(reverseSortedArray);
		printArray(reverseSortedArray, "MERGE");

		MergeSortProgram mergeSortProgram2 = new MergeSortProgram();
		mergeSortProgram2.sort(randomArray_1024);

		MergeSortProgram mergeSortProgram3 = new MergeSortProgram();
		mergeSortProgram3.sort(randomArray_32768);

		MergeSortProgram mergeSortProgram4 = new MergeSortProgram();
		mergeSortProgram4.sort(randomArray_1048576);

		System.out.println("\n************************MERGE SORT ENDS********************************** ");
	}

	private static void heapSortCases(int[] randomArray_32, int[] randomArray_1024, int[] randomArray_32768,
			int[] randomArray_1048576, int[] sortedArray, int[] reverseSortedArray) {

		System.out.println("\n************************HEAP SORT BEGINS********************************** ");

		HeapSortProgram heapSortProgram1 = new HeapSortProgram();
		heapSortProgram1.sort(randomArray_32);
		printArray(randomArray_32,"HEAP");

		HeapSortProgram heapSortProgram2 = new HeapSortProgram();
		heapSortProgram2.sort(randomArray_1024);

		HeapSortProgram heapSortProgram3 = new HeapSortProgram();
		heapSortProgram3.sort(randomArray_32768);

		HeapSortProgram heapSortProgram4 = new HeapSortProgram();
		heapSortProgram4.sort(randomArray_1048576);

		HeapSortProgram heapSortProgram5 = new HeapSortProgram();
		heapSortProgram5.sort(sortedArray);
		printArray(sortedArray,"HEAP");

		HeapSortProgram heapSortProgram6 = new HeapSortProgram();
		heapSortProgram6.sort(reverseSortedArray);
		printArray(reverseSortedArray, "HEAP");

		System.out.println("\n************************HEAP SORT ENDS********************************** ");
	}
	/**
	 * This method prints the elements inside the array.
	 * @param arr
	 */
	private static void printArray(int[] arr, String sorting) {
		System.out.println("After " + sorting + " Sort Implementation ........ ");
		for (int i : arr) {
			System.out.print(" " + i);
		}
	}
	/**
	 * This method creates a sorted array, which will be given as input
	 * 
	 * @param arr
	 * @return
	 */
	private static int[] sortedArray(int n) {
		int[] sortedArray = new int[n];
		for (int i = 0; i < n; i++) {
			sortedArray[i] = i;
		}
		return sortedArray;
	}

	/**
	 * This method reverses the  array
	 * 
	 * @param arr
	 * @return
	 */
	private static int[] reverseArray(int n) {
		int[] reverseArray = new int[n];
		for (int i = 0; i < n; i++) {
			reverseArray[i] = n - i - 1;
		}
		return reverseArray;
	}

	/**
	 * This method creates a random array of length 32
	 * 
	 * @param size
	 * @return
	 */
	private static int[] generateRandomArray(int size) {
		Random rand = new Random();
		int[] randomArray = new int[size];
		for (int i = 0; i < size; i++) {
			randomArray[i] = rand.nextInt(size);
		}
		return randomArray;
	}

}

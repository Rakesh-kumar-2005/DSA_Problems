package Arrays;

/*

Description:
  Following program demonstrates the implementation of the Insertion Sort algorithm in Java,
  a simple and intuitive sorting technique that builds the final sorted array one element at a time.

Problem Statement:
  -> Given an unsorted array of integers...
  -> Sort the array in ascending order...
  -> Build the sorted array progressively by inserting each element into its correct position...

Approach:
  > Incremental Sorting Strategy:
     i. Iterate through the array from the second element...
     ii. Compare and shift elements to create a sorted portion...
     iii. Insert each new element into its correct position within the sorted portion...

> Algorithm Steps:
  -> Outer Loop:
     * Start from the second element of the array...
     * Treat the first element as initially sorted...
     * Progressively expand the sorted portion of the array...

  -> Inner Loop (Shifting Mechanism):
     * Compare current element with previous sorted elements...
     * Shift larger elements to the right to make space...
     * Find the correct position for the current element...
     * Insert the current element in its appropriate location...

  -> Insertion Process:
     * Keep track of the current element to be inserted...
     * Move backwards through the sorted portion...
     * Create space by shifting larger elements...
     * Place the current element in its correct sorted position...

> Key Insight:
  -> Builds the sorted array incrementally...
  -> Efficient for small arrays or nearly sorted collections...
  -> Performs well with limited number of elements...

> Example:
  -> For input array [2, 5, 1, 3, 55, 23, 97, 34, 126, 663, 33]
  -> The algorithm progressively sorts the array...
  -> The final sorted array becomes [1, 2, 3, 5, 23, 33, 34, 55, 97, 126, 663]

> Edge Cases:
  -> Handles arrays of various sizes...
  -> Works effectively with partially sorted arrays...
  -> Manages arrays with duplicate elements...
  -> Performs consistently across different input configurations...

> Time and Space Complexity:
  -> Time Complexity: O(n²) where n is the length of the array...
  -> Best Case (already sorted array): O(n)...
  -> Space Complexity: O(1) as sorting is done in-place...

> Performance Characteristics:
  -> Adaptive sorting algorithm...
  -> Minimal extra space requirement...
  -> Stable sorting method - preserves relative order of equal elements...
  -> Most efficient for small datasets or nearly sorted arrays...

*/

public class Insertion_Sort {

    private static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int curr = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = curr;
        }
    }

    private static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 55, 23, 97, 34, 126, 663, 33};
        System.out.println("Original Array : ");
        printArray(arr);
        insertionSort(arr);
        System.out.println("After Sorting the Array is : ");
        printArray(arr);
    }
}

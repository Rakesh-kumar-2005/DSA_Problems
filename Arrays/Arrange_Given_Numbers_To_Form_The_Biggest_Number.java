package Arrays;

/*

Description:
  Following program demonstrates the solution to the "Arrange Given Numbers To Form The Biggest Number" problem using custom string comparison.

Problem Statement:
  -> Given an array of integers.
  -> Arrange these integers in such a way that they form the biggest possible number.
  -> Return the biggest number as a string.

Approach:
  > Custom Sorting Based on String Concatenation:
     i. Use bubble sort with a custom comparison logic.
     ii. Compare two numbers by concatenating them in different orders.
     iii. Sort numbers based on which concatenation produces a larger value.

> Comparison Logic:
  -> For any two numbers X and Y, we compare the strings "XY" and "YX".
  -> If "XY" is lexicographically smaller than "YX", then Y should come before X.
  -> If "YX" is lexicographically smaller than "XY", then X should come before Y.
  -> This ensures that the arrangement leads to the largest possible number.

> Algorithm Steps:
  -> Use bubble sort to arrange the array.
  -> For each pair of numbers (arr[i], arr[j]), create strings "arr[i]arr[j]" and "arr[j]arr[i]".
  -> If "arr[i]arr[j]" is lexicographically smaller than "arr[j]arr[i]", swap arr[i] and arr[j].
  -> After sorting, concatenate all numbers to form the final string.

> Implementation Note:
  -> StringBuilder is used for efficient string concatenation to avoid creating multiple string objects.
  -> This improves performance especially for large arrays.

> Example:
  -> For numbers 3 and 30, compare "330" and "303".
  -> Since "330" > "303", we arrange them as [3, 30].
  -> For numbers 9 and 94, compare "994" and "949".
  -> Since "994" > "949", we arrange them as [9, 94].

> Edge Cases:
  -> Works for numbers of varying digit lengths.
  -> Handles ties correctly due to lexicographical comparison.

> Time and Space Complexity:
  -> Time Complexity: O(n² * d) where n is the length of the array and d is the average number of digits.
  -> Space Complexity: O(n * d) for storing the final string and temporary concatenations.

*/

import java.util.Arrays;

public class Arrange_Given_Numbers_To_Form_The_Biggest_Number {

	 private static String arrangeNumbers(int[] arr) {

		  int n = arr.length;
		  for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					 String AB = arr[i] + "" + arr[j];
					 String BA = arr[j] + "" + arr[i];
					 if (AB.compareTo(BA) < 0) {
						  int temp = arr[i];
						  arr[i] = arr[j];
						  arr[j] = temp;
					 }
				}
		  }

		  StringBuilder ans = new StringBuilder();
		  for (int num : arr) {
				ans.append(String.valueOf(num));
		  }
		  return ans.toString();
	 }

	 public static void main(String[] args) {
		  int[] arr = {12, 345, 2, 6, 7896};
		  System.out.println("The given array is = " + Arrays.toString(arr));
		  System.out.println("The Biggest number that could be formed from the above array is = " + arrangeNumbers(arr));

	 }
}

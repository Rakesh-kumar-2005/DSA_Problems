package Hashing;

/*
   Description:
       Following program demonstrates the solution to the "Two Sum" problem
       using a HashMap-based approach for optimal time complexity...

   Problem Statement:
       -> Given an array of integers and a target sum...
       -> The task is to find two distinct elements in the array that add up to the target...
       -> Return the indices of these two elements as an array...
       -> There is exactly one solution for each valid input, and the same element cannot be used twice...
       -> If no solution exists, return an array with a single element -1...

   Approach:
       > Single-Pass HashMap Method:
           i. Use a HashMap to store visited elements and their indices...
           ii. For each element, calculate its required "partner" value (target - current element)...
           iii. Check if this partner already exists in the HashMap:
               a. If found, we have our solution...
               b. If not found, add current element and its index to the HashMap...
           iv. Continue until a solution is found or all elements are processed...

   Algorithm Steps:
       -> HashMap-Based Solution:
           1. Initialize a HashMap to store elements and their indices...
           2. Initialize a default answer array containing -1 (for no solution case)...
           3. Iterate through the input array:
               a. Calculate the required partner value (target - current element)...
               b. Check if partner exists in HashMap:
                  - If yes, return array containing current index and partner's index...
                  - If no, add current element and its index to HashMap...
           4. Return default answer if no solution found...
       -> Main Method Flow:
           1. Set up a test array and target sum...
           2. Call twoSum method to find solution indices...
           3. Print the result in a formatted message...

   Key Characteristics:
       -> Efficiently solves the problem in O(N) time with a single pass through the array...
       -> Uses HashMap for O(1) lookup operations to check for partner elements...
       -> Handles the case where no solution exists by returning [-1]...
       -> Guarantees to find the solution if it exists in the input array...

       > Implementation Details:
           -> Uses containsKey() to check for partner elements...
           -> Stores each element's value as key and index as value in the HashMap...
           -> Returns indices in the order [current index, partner index]...

   Time and Space Complexity:
       -> Time Complexity: O(N) where N is the length of the input array...
       -> Space Complexity: O(N) for storing up to N elements in the HashMap...
*/

import java.util.HashMap;

public class Two_Sum {

    public static int[] twoSum(int[] arr, int target) {
    
        HashMap<Integer,Integer> mp = new HashMap<>();
        int[] ans = {-1};
        
        for(int i=0; i<arr.length; i++){
            int partner = target-arr[i];
            
            if(mp.containsKey(partner)){
                ans = new int[]{i,mp.get(partner)};
                return ans;
            }else{
                mp.put(arr[i],i);
            }
            
        }
        return ans;
    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,95,35};
        
        int target = 100;
        System.out.print("The target sum " + target + " can be found if we add ");
        
        int[] arr2 = twoSum(arr,target);
        
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i] + ",");
        }

        System.out.print(" these indices...");
    }
}

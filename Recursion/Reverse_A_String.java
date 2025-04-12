package Recursion;

/*

    Description:
        Following program demonstrates the implementation of "String Reversal"
        using a recursive approach...

    Problem Statement:
        -> Given a string...
        -> The task is to reverse the string (e.g., "Hello" becomes "olleH")...
        -> The reversal must be performed without using built-in reverse functions...
        -> This demonstrates string manipulation through recursion...

    Approach:
        > Recursive String Reversal:
            i. Use recursion to build the reversed string character by character...
            ii. Follow the principle that a reversed string equals the reversed substring plus the first character...
            iii. Follow a specific reversal strategy:
                a. Reverse the substring starting from the second character...
                b. Append the first character at the end of this reversed substring...
                c. This effectively moves each character to its reversed position...
            iv. The recursion terminates when the string becomes empty...

    Algorithm Steps:
        -> Recursive String Reversal Implementation:
            1. Check base case: If the string is empty, return an empty string...
            2. Otherwise:
               - Recursively reverse the substring starting from index 1...
               - Append the first character (s.charAt(0)) to this reversed result...
               - This gradually builds the reversed string...
        -> Main Method Flow:
            1. Call reverseString function with the test string "Hello World"...
            2. Print the resulting reversed string...

    Key Characteristics:
        -> Uses a divide-and-conquer approach to string reversal...
        -> Builds the reversed string during the recursive unwinding phase...
        -> Demonstrates head recursion where processing occurs after the recursive call...
        -> Solution is elegant and intuitive through recursion...

        > Implementation Details:
            -> Function accepts a single string parameter...
            -> Returns the reversed string rather than printing it...
            -> Uses substring() and charAt() for string manipulation...
            -> Tests with the string "Hello World"...

    Time and Space Complexity:
        -> Time Complexity: O(n²) where n is the length of the string...
           (The substring operation is O(n) and it's performed n times)
        -> Space Complexity: O(n) for the recursion stack...

    Output Analysis:
        -> For input "Hello World", the output will be "dlroW olleH"...
        -> Each character's position is exactly reversed from its original position...

*/

public class Reverse_A_String {

    public static String reverseString(String s){
        if(s.isEmpty())return "";
        return reverseString(s.substring(1)) + s.charAt(0);
    
    }
    public static void main(String[] args) {
        
        String s = "Hello World";
        System.out.println("Original String : " + s);
        System.out.println("After Reversing : " + reverseString("Hello World"));
    
    }
}

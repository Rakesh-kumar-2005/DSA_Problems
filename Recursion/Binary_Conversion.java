package Recursion;

/*
    Description:
        Following program demonstrates the conversion of decimal numbers to binary representation
        using a recursive approach...

    Problem Statement:
        -> Given a decimal (base-10) integer...
        -> The task is to convert it to its equivalent binary (base-2) representation...
        -> Binary representation consists only of 0s and 1s...
        -> The conversion needs to handle any non-negative integer input...

    Approach:
        > Recursive Binary Conversion:
            i. Use the mathematical property of binary number representation...
            ii. Apply the divide-by-2 methodology recursively...
            iii. Build the binary number from right to left by:
                a. Finding the remainder when divided by 2 (0 or 1)...
                b. Recursively converting the quotient...
                c. Combining the results in proper order...
            iv. Use the base case to terminate recursion...

    Algorithm Steps:
        -> Recursive Binary Conversion Implementation:
            1. Check if n equals 0 (base case)...
            2. If base case is met, return 0...
            3. Otherwise, compute n % 2 to get the least significant bit...
            4. Recursively call findBinary(n / 2) for higher order bits...
            5. Multiply recursive result by 10 and add current bit...
            6. Return the combined result...
        -> Main Method Flow:
            1. Call findBinary with input 45...
            2. Call findBinary with input 31...
            3. Print the resulting binary representations...

    Key Characteristics:
        -> Uses recursion to naturally build the binary representation...
        -> Works for any non-negative integer input...
        -> Produces the correct binary representation as a decimal number...
        -> Elegantly applies the fundamental binary conversion algorithm...

        > Mathematical Basis:
            -> Each digit in binary represents a power of 2...
            -> The algorithm determines which powers of 2 sum to the given number...
            -> Using remainder and integer division naturally extracts these digits...

    Time and Space Complexity:
        -> Time Complexity: O(log n) where n is the input decimal number...
        -> Space Complexity: O(log n) for the recursion stack...
            (The number of recursive calls equals the number of binary digits)
*/

public class Binary_Conversion {
    
    public static int findBinary(int n){
        if (n == 0) {
            return 0;
        } else {
            return (n % 2) + 10 * findBinary(n / 2);
        }
        
    }
    
    public static void main(String[] args) {
        
        System.out.println(findBinary(45));
        System.out.println(findBinary(31));
        
    }
    
}

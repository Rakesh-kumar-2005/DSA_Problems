package Recursion;

/*

    Description:
        Following program demonstrates the implementation of the "Greatest Common Divisor (GCD)" algorithm
        using the Euclidean algorithm with a recursive approach...

    Problem Statement:
        -> Given two positive integers a and b...
        -> The task is to find their greatest common divisor (GCD)...
        -> The GCD is the largest positive integer that divides both numbers without a remainder...
        -> This fundamental calculation has applications in fraction simplification, modular arithmetic, and cryptography...

    Approach:
        > Recursive Euclidean Algorithm:
            i. Use Euclid's elegant mathematical principle that gcd(a,b) = gcd(b, a mod b)...
            ii. Recursively apply this identity until reaching a base case...
            iii. Follow a specific computation strategy:
                a. If b equals 0, then a is the GCD...
                b. Otherwise, recursively compute gcd(b, a%b)...
            iv. The recursion terminates when the remainder becomes 0...

    Algorithm Steps:
        -> Recursive GCD Implementation:
            1. Check base case: If b equals 0, return a as the GCD...
            2. Otherwise, recursively call gcd(b, a%b)...
        -> Main Method Flow:
            1. Call gcd function with two pairs of test values: (1,2) and (144,12)...
            2. Print the resulting GCD for each pair...

    Key Characteristics:
        -> Implements the mathematically optimal Euclidean algorithm...
        -> Works efficiently even for large numbers...
        -> Uses minimal code to express a powerful mathematical concept...
        -> Solution is elegant and concise through recursion...

        > Implementation Details:
            -> Function accepts two integers as parameters...
            -> Returns the computed GCD rather than printing it...
            -> Uses modulo operation to compute remainders...
            -> Tests the algorithm with two different examples...

    Time and Space Complexity:
        -> Time Complexity: O(log(min(a,b))) - proportional to the number of digits in the smaller number...
        -> Space Complexity: O(log(min(a,b))) for the recursion stack...

    Mathematical Foundation:
        -> Based on Euclid's theorem that if a = bq + r, then gcd(a,b) = gcd(b,r)...
        -> Can be proven to always terminate and produce the correct result...
        -> Historically one of the oldest algorithms in common use, dating back to ancient Greece...

*/

public class Calculate_GCD {
    
    public static int gcd(int a , int b){
        if(b == 0)return a;
        return gcd(b,a%b);
    }
    
    public static void main(String[] args) {
        System.out.println(gcd(1,2));
        System.out.println(gcd(144,12));
    }
}

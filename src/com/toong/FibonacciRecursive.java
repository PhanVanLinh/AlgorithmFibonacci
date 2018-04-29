package com.toong;

// Pseudo Code
// First, create a function findFibonacci which will find the fibonacci number at a index
// F(n) = F(n-1) + F(n-2)
// Special case is if n == 0 then the F(0) = 0 and if n == 1 then the F(1) = 1

// For print the first 10 fibonacci numbers
// While i < 10
// Call findFibonacci function with i
// Increase i
// Continue the loop
public class FibonacciRecursive {
    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        // write your code here
        for (int i = 0; i < 10; i++){
            System.out.println(fibonacci(i));
        }
    }
}

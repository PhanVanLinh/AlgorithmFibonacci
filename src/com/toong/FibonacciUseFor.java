package com.toong;

// Pseudo Code
// Init a = 0
// Init b = 1
// While i still < n
//   if (i <= 1) print i
//   else
//       a = a + b
//       b = b - a
//       print b
//   increase i
//  continue the loop

public class FibonacciUseFor {

    public static void main(String[] args) {
        // write your code here
        printFibonacci(10);
    }

    private static void printFibonacci(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                System.out.println(i);
                continue;
            }
            b = a + b;
            a = b - a;
            System.out.println(b);
        }
    }
}

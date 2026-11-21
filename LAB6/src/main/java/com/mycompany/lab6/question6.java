/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

/**
 *
 * @author fawwa
 */
public class question6 {
    
    // Returns true if n is a prime number
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; (long) i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Returns the digits of n in reverse order as a number
    public static int reverse(int n) {
        int result = 0;
        while (n > 0) {
            result = result * 10 + n % 10;
            n /= 10;
        }
        return result;
    }

    // A palindromic prime is a prime that equals its own reverse
    public static boolean isPalindromicPrime(int n) {
        return isPrime(n) && n == reverse(n);
    }

    // An emirp is a prime whose reverse is also prime, but is not a palindrome
    public static boolean isEmirp(int n) {
        int reversed = reverse(n);
        return isPrime(n) && isPrime(reversed) && n != reversed;
    }

    public static void main(String[] args) {
        final int COUNT = 20;
        final int PER_LINE = 10;

        System.out.println("First 20 palindromic primes:");
        int found = 0;
        for (int n = 2; found < COUNT; n++) {
            if (isPalindromicPrime(n)) {
                found++;
                System.out.print(n + (found % PER_LINE == 0 ? "\n" : " "));
            }
        }

        System.out.println("\nFirst 20 emirps:");
        found = 0;
        for (int n = 2; found < COUNT; n++) {
            if (isEmirp(n)) {
                found++;
                System.out.print(n + (found % PER_LINE == 0 ? "\n" : " "));
            }
        }
    }
}
    


// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-based-problems/challenges/basic-level-0-number-based-problem-9/problem?isFullScreen=true
// Problem     Basic_Level_0_Number_Based_Problem_9
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-08, 08:45 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Main {

    static long reverse(long n) {
        long rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        return rev;
    }

    static boolean isPalindrome(long n) {
        return n == reverse(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        int maxIterations = sc.nextInt();

        long n = num;

        for (int i = 0; i < maxIterations; i++) {
            if (isPalindrome(n)) {
                System.out.println("No");
                return;
            }

            n = n + reverse(n);
        }

        // Palindrome was not obtained within the given iterations
        System.out.println("Yes");
    }
}

// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-based-problems/challenges/basic-level-0-number-based-problem-8/problem?isFullScreen=true
// Problem     Basic_Level_0_Number_Based_Problem_8
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-06, 09:27 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {

    static long reverse(long n) {
        long rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        return rev;
    }

    static boolean isPalindrome(long n) {
        return n == reverse(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        while (!isPalindrome(num)) {
            num = num + reverse(num);
        }

        System.out.println(num);
    }
}

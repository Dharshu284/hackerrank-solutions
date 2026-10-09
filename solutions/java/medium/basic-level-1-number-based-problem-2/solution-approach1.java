// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-based-problems/challenges/basic-level-1-number-based-problem-2/problem?isFullScreen=true
// Problem     Basic_Level_1_Number_Based_Problem_2
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-09, 09:20 a.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {
    static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean isCircularPrime(int n) {
        String s = String.valueOf(n);
        int len = s.length();

        for (int i = 0; i < len; i++) {
            if (!isPrime(Integer.parseInt(s))) {
                return false;
            }
            s = s.substring(1) + s.charAt(0);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        boolean first = true;

        for (int i = start; i <= end; i++) {
            if (isCircularPrime(i)) {
                if (!first) System.out.print(" ");
                System.out.print(i);
                first = false;
            }
        }
    }
}

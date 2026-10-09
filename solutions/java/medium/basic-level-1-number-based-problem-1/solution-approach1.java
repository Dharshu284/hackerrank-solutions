// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-based-problems/challenges/basic-level-1-number-based-problem-1/problem?isFullScreen=true
// Problem     Basic_Level_1_Number_Based_Problem_1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-09, 09:19 a.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {
    static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = String.valueOf(n);
        int len = s.length();
        boolean circular = true;

        for (int i = 0; i < len; i++) {
            if (!isPrime(Integer.parseInt(s))) {
                circular = false;
                break;
            }

            s = s.substring(1) + s.charAt(0);
        }

        if (circular)
            System.out.println("CIRCULAR PRIME");
        else
            System.out.println("NOT CIRCULAR PRIME");
    }
}

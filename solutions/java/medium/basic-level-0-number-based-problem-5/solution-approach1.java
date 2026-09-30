// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-based-problems/challenges/basic-level-0-number-based-problem-5/problem?isFullScreen=true
// Problem     Basic_Level_0_Number_Based_Problem_5
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-30, 08:39 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        while (n != 1 && n != 4) {
            long sum = 0;

            while (n > 0) {
                long digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }

            n = sum;
        }

        if (n == 1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

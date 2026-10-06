// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-based-problems/challenges/basic-level-0-number-based-problem-7/problem?isFullScreen=true
// Problem     Basic_Level_0_Number_Based_Problem_7
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-06, 09:26 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        long square = num * num;
        String s = String.valueOf(num);
        int n = s.length();

        long divisor = 1;
        for (int i = 0; i < n; i++) {
            divisor *= 10;
        }

        long right = square % divisor;
        long left = square / divisor;

        if (left + right == num)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

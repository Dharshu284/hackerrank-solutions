// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-based-problems/challenges/basic-level-0-number-based-problem-1/problem?isFullScreen=true
// Problem     Basic_Level_0_Number_Based_Problem_1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-09, 03:06 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long square = n * n;

        long temp = n;
        long rev = 0;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }

        long revSquare = rev * rev;

        temp = revSquare;
        long reverseSquare = 0;

        while (temp > 0) {
            reverseSquare = reverseSquare * 10 + temp % 10;
            temp = temp / 10;
        }

        if (square == reverseSquare)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

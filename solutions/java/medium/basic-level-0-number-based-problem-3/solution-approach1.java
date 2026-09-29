// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-based-problems/challenges/basic-level-0-number-based-problem-3/problem?isFullScreen=true
// Problem     Basic_Level_0_Number_Based_Problem_3
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-29, 08:59 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        long temp = num;
        long sum = 0;

        while (temp > 0) {
            long digit = temp % 10;
            long fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            temp /= 10;
        }

        if (sum == num)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-based-problems/challenges/basic-level-0-number-based-problem-2/problem?isFullScreen=true
// Problem     Basic_Level_0_Number_Based_Problem_2
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-29, 08:58 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = num;
        int digits = String.valueOf(num).length();
        long sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == num)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

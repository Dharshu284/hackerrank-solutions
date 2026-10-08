// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-based-problems/challenges/basic-level-0-number-based-problem-10/problem?isFullScreen=true
// Problem     Basic_Level_0_Number_Based_Problem_10
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-08, 08:46 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n1 = sc.next();
        String n2 = sc.next();

        if (n1.length() == n2.length() && (n1 + n1).contains(n2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

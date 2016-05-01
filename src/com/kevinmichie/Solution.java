package com.kevinmichie;

import java.util.Scanner;

public class Solution {

    /*
    If book is returned on or before, fine is 0
    If book is returned on same month, but after date fine is 15 x days
    If book is returned outside of the month, but in the same calendar year 500 x # of Months Late
    If book is returned after the calendar year, 1000.
     */

    public int LateFee(int returnDay, int returnMonth, int returnYear, int dueDay, int dueMonth, int dueYear) {
        if (returnYear == dueYear && returnMonth == dueMonth) {
            if (returnDay < dueDay) {
                return 0;
            } else {
                return 15 * (returnDay - dueDay);
            }

        }
        if (returnYear == dueYear && returnMonth != dueMonth) {
            if ((returnMonth - dueMonth) > 0) {
                return 500 * (returnMonth - dueMonth);
            } else {
                return 0;
            }
        }
        else {
            return 10000;
        }
    }

    public static void main(String[] args) {
	    Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int returnDay = scanner.nextInt();
        int returnMonth = scanner.nextInt();
        int returnYear = scanner.nextInt();
        int dueDay = scanner.nextInt();
        int dueMonth = scanner.nextInt();
        int dueYear= scanner.nextInt();

        System.out.println(solution.LateFee(returnDay, returnMonth, returnYear, dueDay, dueMonth,  dueYear));
    }
}

/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
import Array;
class Solution {
    public int reverse(int x) {
        long Result = 0;

        while (x != 0) {
            Result = Result * 10;
            Result += x % 10;
            x = x / 10;
        }

        System.out.println(Result);
        if (Result < Integer.MIN_VALUE || Result > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) Result;
        }

    }
}
// @lc code=end

/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */

// @lc code=start
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1){
            return true;
        }
        if (n == 0 || n < 0){
            return false;
        }
        int newN = n;
        while (newN > 1){
            if (newN %2  == 1){
                return false;
            }
            newN /= 2;
            
        }
        return true;
    }
}
// @lc code=end


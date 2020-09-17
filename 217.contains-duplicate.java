import java.util.HashMap;

/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i : nums) {
            if (h.containsKey(i)){
                return true;
            }
            h.put(i, 1);
        }
        return false;
    }
}
// @lc code=end


import java.util.Arrays;

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.equals("") || t.equals("")){
            return true;
        }
        int[] list = new int[26];
        String[] first = s.split("");
        String[] second = t.split("");
        if (first.length != second.length){
            return false;
        }

        for (int i = 0; i < first.length; i++) {
            list[(int) first[i].charAt(0) - 'a'] += 1;
        }

        for (int i = 0; i < second.length; i++) {
            list[(int) second[i].charAt(0) - 'a'] -= 1;
        }
  
        for (int i = 0; i < list.length; i++) {
            
            if (list[i] != 0){
                return false;
            }
        }

        return true;
        
        // System.out.println( (int) "b".charAt(0) - 'a' );
    }
}
// @lc code=end


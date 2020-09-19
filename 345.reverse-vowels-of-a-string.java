import java.util.Arrays;
import java.util.HashMap;

/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
class Solution {
    public String reverseVowels(final String s) {
        String[] g = s.split("");
        HashMap<String, String> h = new HashMap<>();
        h.put("a", "a");
        h.put("e", "e");
        h.put("i", "i");
        h.put("o", "o");
        h.put("u", "u");
        int leftPointer = 0;
        int rightPointer = g.length-1;
        while (leftPointer < rightPointer){
            if (!h.containsKey(g[leftPointer].toLowerCase())){
                leftPointer ++;
                continue;
            }
            if (!h.containsKey(g[rightPointer].toLowerCase())){
                rightPointer --;
                continue;
            }

            final String v = g[rightPointer];
            g[rightPointer] = g[leftPointer];
            g[leftPointer] = v;
            leftPointer ++;
            rightPointer --;
            
        }
        
        return String.join("", g);
    }
}
// @lc code=end


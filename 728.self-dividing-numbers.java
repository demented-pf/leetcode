import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=728 lang=java
 *
 * [728] Self Dividing Numbers
 */

// @lc code=start
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int splitNumber = i;
            boolean wasDivisble = false;
            
            while (splitNumber > 0){
                
                if (splitNumber % 10 == 0){
                    wasDivisble = false;
                    break;
                }
                
                if (i % (splitNumber % 10) == 0){
                    wasDivisble = true;
                }
                else {
                    wasDivisble = false;
                    break;
                }
                splitNumber /= 10;
            }

            if (wasDivisble){
                result.add(i);
            }
        }

        return result;
        
    }
}
// @lc code=end


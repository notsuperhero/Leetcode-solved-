import java.util.HashSet;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        HashSet<Integer> numset = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numset.add(nums[i]);
        }
        int longestSub = 1;
        for (int num : numset) {
            if (numset.contains(num - 1)) {
                continue; // skip if it's not sequence start
            } else {
                int currentNum = num;
                int currentSub = 1;
                while (numset.contains(currentNum + 1)) { // move forward
                    currentNum++;
                    currentSub++;
                }
                longestSub = Math.max(longestSub, currentSub);
            }
        }
        return longestSub;
    }
}

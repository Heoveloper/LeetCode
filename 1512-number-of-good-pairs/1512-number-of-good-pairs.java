class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairsCnt = 0;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) break;
                if (nums[i] == nums[j]) goodPairsCnt++;
            }
        }
        
        return goodPairsCnt;
    }
}
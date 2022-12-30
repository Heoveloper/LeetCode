class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        
        int j = 0;
        while (ans[ans.length-1] == 0) {
            for (int i : nums) {
                ans[j++] = i;
            }
        }
        
        return ans;
    }
}
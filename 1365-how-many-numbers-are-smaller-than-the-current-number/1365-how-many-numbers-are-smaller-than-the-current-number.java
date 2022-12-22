class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            for (int j : nums) {
                if (nums[i] > j) answer[i]++;
            }
        }
        
        return answer;
    }
}
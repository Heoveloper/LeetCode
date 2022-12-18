class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        
        int j = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i+1]) nums[j++] = nums[i+1];
            else duplicates.add(nums[i]);
        }
        
        int dupIndex = 0;
        for (int k = nums.length - duplicates.size(); k < nums.length; k++) {
            nums[k] = duplicates.get(dupIndex);
            dupIndex++;
        }
        
        return j;
    }
}
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        
        for (int i : nums) numsMap.put(i, numsMap.getOrDefault(i, 0)+1);
        for (int i : nums) if (numsMap.get(i) == 1) return i;
        
        return 0;
    }
}
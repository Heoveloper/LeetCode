class Solution {
    public int climbStairs(int n) {
        int[] way = new int[n+1];
        way[0] = 1;
        way[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            way[i] = way[i-2] + way[i-1];
        }
        
        return way[n];
    }
}
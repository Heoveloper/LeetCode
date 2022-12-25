class Solution {
    public int smallestEvenMultiple(int n) {
        int smallestMultiple = (n%2 == 0) ? n : n*2;
        
        return smallestMultiple;
    }
}
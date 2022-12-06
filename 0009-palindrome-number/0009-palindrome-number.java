class Solution {
    public boolean isPalindrome(int x) {
        int xP = 0;
        int xC = x;
        
        while (x > 0) {
            xP = (xP*10 + x%10);
            x /= 10;
        }
        x = xC;
        
        if (xP != x) return false;
        
        return true;
    }
}
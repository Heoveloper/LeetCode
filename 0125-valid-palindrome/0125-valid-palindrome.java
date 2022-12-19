class Solution {
    public boolean isPalindrome(String s) {
        boolean isP = false;
        String sText = s.replaceAll("[\\W_]", "").toLowerCase();
        int sLen = sText.length();
        
        if (sLen == 0 || sLen == 1) return true;
        for (double i = 0; sLen%2 == 0 ? i <= sLen/2 : i < sLen/2; i++) {
            if (sText.charAt((int) i) != sText.charAt((int) (sLen-1-i))) return false;
            else isP = true;
        }
        
        return isP;
    }
}
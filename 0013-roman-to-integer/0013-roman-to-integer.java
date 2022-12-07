class Solution {
    public int romanToInt(String s) {
        int n = 0;
        int sLen = s.length();
        
        for (int i = sLen - 1; i >= 0; i--) {
            char sC = s.charAt(i);
            if (sC == 'I') {
                n += (n >= 5 || n >= 10) ? -1 : 1;
            } else if (sC == 'V') {
                n += 5;
            } else if (sC == 'X') {
                n += (n >= 50 || n >= 100) ? -10 : 10;
            } else if (sC == 'L') {
                n += 50;
            } else if (sC == 'C') {
                n += (n >= 500 || n >= 1000) ? -100 : 100;
            } else if (sC == 'D') {
                n += 500;
            } else if (sC == 'M') {
                n += 1000;
            }
        }
        
        return n;
    }
}
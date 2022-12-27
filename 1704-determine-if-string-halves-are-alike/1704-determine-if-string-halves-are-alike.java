class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        String vowels = "aeiou";
        int cnt = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length()/2) cnt += vowels.indexOf(s.charAt(i)) >= 0 ? 1 : 0;
            else cnt -= vowels.indexOf(s.charAt(i)) >= 0 ? 1 : 0;
        }
        
        return cnt == 0;
    }
}
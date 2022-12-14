class Solution {
    public int lengthOfLastWord(String s) {
        String[] sSplit = s.split(" ");
        
        return sSplit[sSplit.length-1].length();
    }
}
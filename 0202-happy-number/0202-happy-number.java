class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> nArr = new ArrayList<>();
        while (n > 0) {
            nArr.add(n%10);
            n /= 10;
        }
        
        int powSum = 0;
        ArrayList<Integer> powSumArr = new ArrayList<>();
        for (int i = 0; i < nArr.size(); i++) {
            while (i < nArr.size()) {
                powSum += (int) Math.pow(nArr.get(i), 2);
                if (powSum == 1) break;
                else if (i == nArr.size()-1 && powSumArr.contains(powSum)) return false;
                else if (i == nArr.size()-1 && powSum != 1) {
                    powSumArr.add(powSum);
                    nArr.clear();
                    while (powSum > 0) {
                        nArr.add(powSum%10);
                        powSum /= 10;
                    }
                    i = 0;
                    continue;
                }
                i++;
            }
        }
        
        return true;
    }
}
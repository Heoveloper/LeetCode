class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> validMap = Map.of(')', '(', ']', '[', '}', '{');
        Stack<Character> stack = new Stack<>();
        if ((s.length()%2) != 0) return false;
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (stack.empty() || stack.pop() != validMap.get(c)) {
                return false;
            }
        }
        
        return (stack.empty()) ? true : false;
    }
}
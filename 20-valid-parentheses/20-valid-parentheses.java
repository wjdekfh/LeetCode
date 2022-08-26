class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> brackets = new HashMap();
        brackets.put('{', '}');
        brackets.put('(', ')');
        brackets.put('[', ']');

        for(int i=0; i<s.length(); i++) {
            char bracket = s.charAt(i);
            if(brackets.containsKey(bracket)) {
                stack.push(bracket);
            }else {
                if(stack.size() == 0) return false;
                if(brackets.get(stack.peek()) != bracket) {
                    break;
                }
                stack.pop();
            }
        }

        return stack.size() == 0;
    }
}
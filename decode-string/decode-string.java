class Solution {
    private Stack<Character> stack = new Stack();
    
    public String decodeString(String s) {
        List<String> result = new ArrayList();
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c != ']') {
                stack.push(c);
            }else {
                StringBuffer cha = new StringBuffer();

                System.out.println("1>> " + stack);
                
                while(stack.peek() != '[') {
                    cha.append(stack.pop());
                }
                
                System.out.println("2>> " + stack);
                stack.pop(); // '[' 까지 제거    
                
                System.out.println("3>> " + stack);
                
                // 반복횟수 가져오기
                StringBuffer rot = new StringBuffer();
                while(!stack.isEmpty() && stack.peek().toString().matches("[0-9]")) {
                    rot.append(stack.pop());
                }
    
                System.out.println("4>> " + stack);
                
                rot.reverse();
                int rott = Integer.parseInt(rot.toString());
                
                String chaString = cha.toString();
                for(int j=1; j<rott; j++) {
                    cha.append(chaString);
                }
                System.out.println(">> " + rott);
                System.out.println(cha);
                
                while(!stack.isEmpty() && stack.peek() != '[') {
                    cha.append(stack.pop());
                }
                
                System.out.println("5>> " + stack);
                
                cha.reverse();
                for(int k=0; k<cha.length(); k++) {
                    stack.push(cha.charAt(k));
                }
                
                System.out.println("6>> " + stack);
            }
        }
        
        while(!stack.isEmpty()) {
            result.add(0, stack.pop().toString());
        }
        
        return String.join("", result);
    }
}
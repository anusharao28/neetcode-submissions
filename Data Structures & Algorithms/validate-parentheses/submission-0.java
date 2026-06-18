class Solution {
    public boolean isValid(String s) {

        //brute force
        /*  while(s.contains("()") || s.contains("{}")|| s.contains("[]")){
            s=s.replace("()","");
            s=s.replace("{}","");
            s=s.replace("[]","");
        }
        return s.isEmpty();
        */

        //stack
        Stack<Character> stack=new Stack<>();
        Map<Character,Character>map=new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                if(!stack.isEmpty() && stack.peek()==map.get(c)){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}

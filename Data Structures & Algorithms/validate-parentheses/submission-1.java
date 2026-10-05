class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)=='(') || (s.charAt(i)=='[') || (s.charAt(i)=='{'))
                stack.push(s.charAt(i));
            else if(!stack.isEmpty()){
                char temp=stack.pop();

                if((temp=='(') && (s.charAt(i)==')'))
                    continue;
                else if((temp=='[') && (s.charAt(i)==']'))
                    continue;
                else if((temp=='{') && (s.charAt(i)=='}'))
                    continue;
                else
                    return false;

            }
            else{
                return false;
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
        
    }
}

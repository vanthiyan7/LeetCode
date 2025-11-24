class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] a = s.toCharArray();
        for(char k: a)
        {
            if(k == '('||k == '['||k == '{')
            stack.push(k);
            else
            {
                if(stack.isEmpty())
                return false;
                char ch = stack.pop();
                
                if(k == ')' && ch!='(')
                return false;
                if(k == ']' && ch!='[')
                return false;
                if(k == '}' && ch!='{')
                return false;
            }
           

        }
      return stack.isEmpty();   
    }
}
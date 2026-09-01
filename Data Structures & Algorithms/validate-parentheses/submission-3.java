class Solution {
    public boolean isValid(String s) {
        char c = 'a'; 
        Set <Character> open = Set.of('{' , '[' , '(') ;
        Map <Character, Character> mapp = Map.of('(' , ')', '{', '}' , '[' , ']') ; 
        Stack<Character> stack = new Stack<>();

        for ( int i = 0 ; i< s.length(); i++){
            c = s.charAt(i) ;
            if (open.contains(c) ){
                stack.push(c); 
            }
            else {
                if(!stack.isEmpty() && mapp.get(stack.peek())== c){
                stack.pop(); 
                }
                else {
                    return false; 
                }
            }
        }
        return stack.isEmpty();
    }
}

class Solution {
    public int maxDepth(String s) {
        int open=0;
        int maxopen=0;
        for(int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if(c == '('){
                open++;
                maxopen = Math.max(maxopen , open);
            }
             if(c == ')'){
                open--;
            }
        }
        return maxopen;
        
    }
}
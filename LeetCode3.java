import java.util.ArrayList;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> map = new HashSet<>();
        
        int n = s.length();
        int i = 0, j = 0, ans = 0;
        
        while(i < n && j < n){
            if (!map.contains(s.charAt(j))){
                map.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else{
                map.remove(s.charAt(i++));
            }
        }
        return ans;
                
          
        
    }
}

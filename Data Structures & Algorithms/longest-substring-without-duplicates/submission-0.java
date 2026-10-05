class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set=new HashSet<Character>();

        int start=0;
        int res=0;

        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(i));
            res=Math.max(res,i-start+1);
        }

        return res;
        
    }
}

class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty() || s.isEmpty() || t.length() > s.length()) {
            return "";
        }

        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        HashMap<Character,Integer> map1=new HashMap<Character,Integer>();

        for(int i=0;i<t.length();i++)
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);

        int l=0;
        int need=map.size(),have =0;
        int res[]={-1, -1};
        int minLength=Integer.MAX_VALUE;
        for(int r=0;r<s.length();r++){
            map1.put(s.charAt(r),map1.getOrDefault(s.charAt(r),0)+1);

            if(map.containsKey(s.charAt(r)) && map.get(s.charAt(r)).equals(map1.get(s.charAt(r)))){
                have++;
            }

            while(need==have){
                if(r-l+1<minLength){
                    res[0]=l;
                    res[1]=r;
                    minLength=r-l+1;
                }
                
                
              
               
                if(map.containsKey(s.charAt(l)) && map.get(s.charAt(l))           .equals(map1.get(s.charAt(l)))){
                    have--;
                }
                map1.put(s.charAt(l),map1.get(s.charAt(l))-1);
                l++;
                
              
            }
        }

        return res[0]==-1?"":s.substring(res[0],res[1]+1);


        
    }
}

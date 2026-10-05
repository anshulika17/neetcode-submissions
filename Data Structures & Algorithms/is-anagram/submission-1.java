class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
            return false;

        HashMap<Character,Integer> m1=new HashMap<Character,Integer>();
        HashMap<Character,Integer> m2=new HashMap<Character,Integer>();

        for(int i=0;i<s.length();i++){
    
            m1.put(s.charAt(i),m1.getOrDefault(s.charAt(i),0)+1);
            m2.put(t.charAt(i),m2.getOrDefault(t.charAt(i),0)+1);
            
        }

        for(Map.Entry<Character,Integer> m: m1.entrySet()){
            if(!m.getValue().equals(m2.get(m.getKey())))
                return false;
        }

        return true;

        

    }
}

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1count[]=new int[26];
        int s2count[]=new int[26];

        if(s1.length()>s2.length()){
            return false;
        }

        for(int i=0;i<s1.length();i++){
            s2count[s2.charAt(i)-'a']++;
            s1count[s1.charAt(i)-'a']++;

        }

        int matches=0;

        for(int i=0;i<26;i++){
            if(s1count[i]==s2count[i]){
                matches++;
            }

        }

        int l=0;
        for(int r=s1.length();r<s2.length();r++){

            if(matches==26){
                return true;
            }

            int index=s2.charAt(r)-'a';

            if(s2count[index]==s1count[index]){
                matches--;
            }
            
            else if(s2count[index]+1==s1count[index]){
                matches++;
            }

            s2count[index]++;

            index=s2.charAt(l)-'a';

            if(s2count[index]==s1count[index]){
                matches--;
            }
            
            else if(s2count[index]-1==s1count[index]){
                matches++;
            }

            s2count[index]--;
            l++;

        }

        return matches==26;
    }
}

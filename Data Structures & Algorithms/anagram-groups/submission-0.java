class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,ArrayList<String>> result=new HashMap<String,ArrayList<String>>();
        
        for(int i=0;i<strs.length;i++){
            char arr[]=strs[i].toCharArray();
            int freq[]=new int[26];

            for(int j=0;j<arr.length;j++){

                freq[arr[j]-'a']= freq[arr[j]-'a']+1;
                
            }

            String key=Arrays.toString(freq);
            result.putIfAbsent(key,new ArrayList<>());
            result.get(key).add(strs[i]);
        }

        return new ArrayList(result.values());
    }
}

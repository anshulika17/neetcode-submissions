class Solution {

    public String encode(List<String> strs) {

        String result="";

        for(String str:strs){

            result=result+str.length()+"#"+str;

        }

        return result;

    }

    public List<String> decode(String str) {

        List<String> result=new ArrayList<>();

        int i=0;

        while(i<str.length()){

        int j=i;

        while(str.charAt(j)!='#'){
            j++;
        }

        int length = Integer.parseInt(str.substring(i, j));

        int start=j+1;

        String temp=str.substring(start,length+start);

        result.add(temp);

        i=start+length;
            

        }

        return result;

    }
}

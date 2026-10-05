class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<Integer>[] list=new List[nums.length+1]; 

         for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer>  m: map.entrySet()){
            list[m.getValue()].add(m.getKey());
        }

        int[] res = new int[k];
        int index=0;

        for(int i=nums.length;i>0 && k>index;i--){
            if(list[i]!=null){
                for(int arr:list[i]){
                    res[index]=arr;
                    if(index==k){
                        return res;
                    }
                    index++;
                }

            }
        }

        return res;
        
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> list=new HashMap<Integer,Integer> ();

        int result[]=new int[2];

        for(int i=0;i<nums.length;i++){

            list.put(nums[i],i);

        }

        for(int i=0;i<nums.length;i++){

            int diff=target-nums[i];

            if((list.get(diff)!=null) && (i!=list.get(diff))){
                result[0]=i;
                result[1]=list.get(diff);
                return result;
            }

        }

        return result;

    }   
        
    
}

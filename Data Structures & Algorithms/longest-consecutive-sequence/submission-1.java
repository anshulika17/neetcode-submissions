class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> list=new HashSet<Integer>();

        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i]))
                continue;
            else
                list.add(nums[i]);
            
        }

        int max=0;

        for(int num:nums){

            if(list.contains(num-1)){
                continue;
            }
            else{
                int length=1;
                int temp=num+1;
                while(list.contains(temp)){  
                    temp=temp+1;                  
                    length++;

                }
            max=Math.max(length,max);

            }

            
            

        }

        return max;
        
    }
}

class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> list=new HashSet<Integer>();
        int i=0;

        if(nums.length==0)
            return false;

        while(i<nums.length)
        {
            if(list.contains(nums[i])){
                return true;
            }
            else{
                list.add(nums[i]);
            }
            i++;
        }

        return false;
        
    }
}
class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> list=new HashSet<Integer>();
        int i=0;

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
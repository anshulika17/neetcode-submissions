class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res=new ArrayList<> ();

        for(int i=0;i<nums.length;i++){

            if(i!=0 && nums[i]==nums[i-1])
                continue;
            int l=i+1;
            int r=nums.length-1;

            while(l<r){
                if(nums[i]+nums[l]+nums[r]>0)
                    r--;
                else if(nums[i]+nums[l]+nums[r]<0)
                    l++;

                else{
                    List<Integer> list=new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }
                }

            }
        }
        return res;
        
    }
}

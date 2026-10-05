class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n=nums.length;
        int result[]=new int[n-k+1];
        Deque<Integer> queue=new LinkedList<>();

        int l=0;

        for(int r=0;r<nums.length;r++){
            while(!queue.isEmpty() && queue.getLast()<nums[r]){
                queue.removeLast();
            }

            queue.add(nums[r]);

            if(r-l+1==k){
                result[l]=queue.getFirst();
                if(queue.getFirst()<=nums[l]){
                    queue.removeFirst();
                }
                
                l++;
            }
        }

        return result;
        
    }
}

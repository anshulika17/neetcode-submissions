class Solution {
    public int trap(int[] height) {

        int i=0;
        int j=height.length-1;
        int maxLeft=height[i];
        int maxRight=height[j];
        int capacity=0;


        while(i<j){

            maxRight=Math.max(maxRight,height[j]);
            maxLeft=Math.max(maxLeft,height[i]);
            
            if(maxLeft<maxRight){
                capacity+=maxLeft-height[i];
                i++;
            }else{
                capacity+=maxRight-height[j];
                j--;
            }
            

        }

        return capacity;
        
    }
}

class Solution {
    public int trap(int[] height) {

        int i=0;
        int j=height.length-1;
        int maxLeft=height[i];
        int maxRight=height[j];
        int capacity=0;


        while(i<j){
            
            if(maxLeft>maxRight){
                j--;
                maxRight=Math.max(maxRight,height[j]);
                capacity+=maxRight-height[j];
            }
            else{
                i++;
                maxLeft=Math.max(maxLeft,height[i]);
                capacity+=maxLeft-height[i];
            }
            

        }

        return capacity;
        
    }
}

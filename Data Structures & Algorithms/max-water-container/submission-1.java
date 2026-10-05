class Solution {
    public int maxArea(int[] heights) {

        int max=0;
        int i=0,j=heights.length-1;
        while(i<j){
            int height=Math.min(heights[i],heights[j]);
            int width=j-i;

            int cap=height*width;

            max=Math.max(max,cap);

            if(heights[i]>heights[j])
                j--;
            else
                i++;
        }

        return max;
        
    }
}

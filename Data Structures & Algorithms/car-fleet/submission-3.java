class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        Stack<Double> stack=new Stack<>();
        int pair[][]=new int[position.length][2];

        for(int i=0;i<position.length;i++){
            pair[i][0]=position[i];
            pair[i][1]=speed[i];
        }

        Arrays.sort(pair,(a,b)->Integer.compare(b[0],a[0]));

        
        for(int i=0;i<position.length;i++){
        
            double temp=(double)(target-pair[i][0])/pair[i][1];

            if(stack.isEmpty()){
                stack.push(temp);
            }
            else if(stack.peek()<temp){
                stack.push(temp);
            }            

        }

        return stack.size();
        
    }
}

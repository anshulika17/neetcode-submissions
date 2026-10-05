class Solution {
    public boolean isValidSudoku(char[][] board) {

        int row[]=new int[9];
        int col[]=new int[9];
        int sqaure[]=new int[9];


        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){

                if(board[i][j]=='.')
                    continue;
                int value=board[i][j]-'0';

                int bit=1<<value;


                if((row[i] & bit)!=0){
                    return false;
                }

                if((col[j] & bit)!=0){
                    return false;
                }

                int index=(i/3)*3+(j/3);

                if((sqaure[index] & bit)!=0){
                    return false;
                }

                row[i]=row[i] | bit;
                col[j]=col[j] | bit;
                sqaure[index]= sqaure[index] | bit;


                


            }

            
        }

        return true;
        
    }
}

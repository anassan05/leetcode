class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        List<List<String>> res=new ArrayList<>();
        boolean cols[]=new boolean[n];
        boolean diag1[]=new boolean[2*n-1];
        boolean diag2[]=new boolean[2*n-1];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        backtrack(0,n,board,cols,diag1,diag2,res);
        return res;
    }
    private void backtrack(int row,int n,char [][]board,boolean []cols,
                boolean[] diag1,boolean[] diag2,List<List<String>> res){
                    if(row==n){
                        List<String> sol=new ArrayList<>();
                        for(char[] ch:board) sol.add(new String(ch));
                        res.add(sol);
                        return;
                    }
                    for(int col=0;col<n;col++){
                        if(cols[col]||diag1[row+col]||diag2[row-col+n-1])
                        continue;
                        board[row][col]='Q';
                        cols[col]=true;
                        diag1[row+col]=true;
                        diag2[row-col+n-1]=true;
                        backtrack(row+1,n,board,cols,diag1,diag2,res);
                        board[row][col]='.';
                        cols[col]=false;
                        diag1[row+col]=false;
                        diag2[row-col+n-1]=false;
                    }
                }
}
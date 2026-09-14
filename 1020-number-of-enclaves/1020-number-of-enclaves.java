class Solution {
    private int dfs(int row, int col, int[][] grid) {

    if (row < 0 || row >= grid.length ||
        col < 0 || col >= grid[0].length ||
        grid[row][col] == 0) {
        return 0;
    }

    grid[row][col] = 0;

    int count = 1;

    count += dfs(row - 1, col, grid);
    count += dfs(row + 1, col, grid);
    count += dfs(row, col - 1, grid);
    count += dfs(row, col + 1, grid);

    return count;
}

    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        int count=0;
        int ones=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1) ones++;
            }
        }

        for(int j=0;j<m;j++){
            if(grid[0][j]==1){
               count+= dfs(0,j,grid);
            }
            if(grid[n-1][j]==1){
               count+= dfs(n-1,j,grid);
            }
        }
         for(int i=0;i<n;i++){
            if(grid[i][0]==1){
               count+= dfs(i,0,grid);
            }
            if(grid[i][m-1]==1){
               count+= dfs(i,m-1,grid);
            }
        }
        return ones-count;
    }
}
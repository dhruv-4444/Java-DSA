class Solution {
    class Pair{
        int row;
        int col;
        int time;

        Pair(int row,int col,int time){
            this.row=row;
            this.col=col;
            this.time=time;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q=new LinkedList<>();
        int vis[][]=new int[grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2) {
                    q.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }
            }
        }
        int maxtime=0;

        int delRow[]={-1,1,0,0};
        int delCol[]={0,0,-1,1};
        while(!q.isEmpty()){
            Pair current=q.poll();
            int row=current.row;
            int col=current.col;
            int time=current.time;
            
            maxtime=Math.max(maxtime,time);
            for(int k=0;k<4;k++){
                int newRow=row+delRow[k];
                int newCol=col+delCol[k];

                if(newRow>=0 && newRow< grid.length && newCol>=0 && newCol<grid[0].length && grid[newRow][newCol]==1 && vis[newRow][newCol]==0){
                    vis[newRow][newCol]=2;
                    q.add(new Pair(newRow,newCol,time+1));
                }
            }
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] ==1 && vis[i][j]==0) return -1;
            }
        }

        return maxtime;
        
        
    }
}
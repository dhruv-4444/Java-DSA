class Solution {
    public int islandPerimeter(int[][] grid) {
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};
        int n = grid.length;
        int m = grid[0].length;
        int perimeter = 0;
        int check = 0;
        boolean[][] vis = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 1) {
                    vis[i][j] = true;
                    check = 0;

                    for (int k = 0; k < 4; k++) {

                        int row = i + delRow[k];
                        int col = j + delCol[k];

                        if (row < 0 || row >= n || 
                            col < 0 || col >= m ||
                            grid[row][col] == 0) {

                            check++;
                        }
                    }

                    perimeter += check;
                }
            }
        }

        return perimeter;
    }
}
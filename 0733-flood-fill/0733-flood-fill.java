class Solution {
    public void dfs(int sr, int sc, int[][] ans, int[][] image, int iniColor, int color, int[] delRow, int[] delCol) {
        ans[sr][sc] = color;
        int n = image.length;
        int m = image[0].length;
        for (int i = 0; i < 4; i++) {
            int row = sr + delRow[i];
            int col = sc + delCol[i];

            if (row >= 0 && row < n && col >= 0 && col < m && image[row][col] == iniColor && ans[row][col] != color)
                dfs(row, col, ans, image, iniColor, color, delRow, delCol);
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int iniColor = image[sr][sc];
        int ans[][] = image;
        int delRow[] = { -1, 0, +1, 0 };
        int delCol[] = { 0, +1, 0, -1 };
        dfs(sr, sc, ans, image, iniColor, color, delRow, delCol);

        return image;
    }
}
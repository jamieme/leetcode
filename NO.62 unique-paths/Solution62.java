class Solution62{
    public static void main(String[] args){
        Solution62 s = new Solution62();
        System.out.println(s.uniquePaths(7, 3));
    }

    public int uniquePaths(int m, int n) {
        if(m<=0||n<=0)  return 0;
        int[][] res= new int[n][m];
        
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(i==n-1&&j==m-1){
                    res[i][j] = 1;
                    continue;
                }
                res[i][j] = (i+1 <n? res[i+1][j]:0) + (j+1<m?res[i][j+1]:0);
            }
        }
        
        return res[0][0];
    }
}
class Solution279{
    public static void main(String[] args){
        Solution279 s = new Solution279();
        System.out.println(s.numSquares(4));  
    }

    public int numSquares(int n) {
        if(n<=0)    return 0;
        int cnt = new Double(Math.sqrt(n*1.0)).intValue()+2;
        int[] squares = new int[cnt];
        for(int i=0;i<cnt;i++){
            int tmp = i*i;
            if(tmp<=n)   squares[i] = tmp;
        }

        int[] dp=new int[n+1];
        for(int i=0;i<n+1;i++)  dp[i] = Integer.MAX_VALUE;

        dp[1]=1;
        dp[0]=0;
        for(int i=2;i<n+1;i++){
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=Math.sqrt(i*1.0);j++){
                if(i-squares[j] >=0 && 1 + dp[i-squares[j]] < min) min = 1+dp[i-squares[j]];
            }
            dp[i] = min;
        }
        return dp[n];
    }
}
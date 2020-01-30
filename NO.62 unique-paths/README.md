## solutionA
method:dp

状态转换方程:dp[i][j] = dp[i+1][j] + dp[i][j+1]
边界条件: dp[n][m] = 1
## solutionA

method:dp
状态转换方程:dp(n)=min(1+dp(n-1), 1+dp(n-4),1+dp(n-9)....)
边界条件: n-square(i) >=0
优化:提前算出1,4,9,16...存入squares
# NO.139 word-break

## solutionA

### method

dp

### 状态转换方程

***dp(i) = dp(i+k1) || dp(i+k2) || ... || dp(i+kn)***

### 边界条件

dp(s.length()) = true

### 优化时间复杂度

通过mem记录访问过的状态

---

## solutionB

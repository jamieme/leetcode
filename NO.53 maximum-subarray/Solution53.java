class Solution53{
    public static void main(String[] args){
        Solution53 s = new Solution53();
        System.out.println(s.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length<=0)  return 0;
        int[] max=new int[nums.length];
        max[0] = nums[0];
        int res = nums[0];
        for(int i=1;i<nums.length;i++){
            max[i] = Math.max(nums[i],max[i-1]+nums[i]);
            if(max[i]>res)  res = max[i];
        }

        return res;
    }
}
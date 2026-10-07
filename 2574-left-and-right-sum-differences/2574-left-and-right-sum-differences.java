class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left=new int[nums.length];
        int right[] =new int[nums.length];
        left[0]=0;
        for(int i=1;i<nums.length;i++){
            left[i]=nums[i-1]+left[i-1];
        }
        int total=left[nums.length-1]+nums[nums.length-1];
        right[0]=total-nums[0];
        for(int i=1;i<nums.length;i++){
            right[i]=right[i-1]-nums[i];
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(left[i]-right[i]);
        }
        return ans;
        
    }
}
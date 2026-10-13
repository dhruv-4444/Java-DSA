class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }        
        Arrays.sort(nums);
        long ans=0;
        for(int i=0;i<nums.length/2;i++){
            ans+=nums[nums.length-i-1]-nums[i];
        }
        if(nums.length%2!=0) return ans+nums[nums.length/2];
        return ans;
    }
}
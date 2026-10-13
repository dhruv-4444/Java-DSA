class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[] = new int[2];
        int tsum=0;
        HashSet<Integer>st=new HashSet<>();
        for(int i=0;i<nums.length+1;i++){
            tsum+=i;
        }
        for(int n:nums){
            if(st.contains(n)) arr[0]=n;
            st.add(n);
            tsum-=n;
        }
        arr[1]=tsum+arr[0];
        return arr;
    }
}
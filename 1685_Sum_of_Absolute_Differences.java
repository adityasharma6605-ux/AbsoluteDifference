class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] prefixSum=new int[nums.length];
        prefixSum[0]=nums[0];

        for(int i=1;i<nums.length;i++){
            prefixSum[i]=prefixSum[i-1]+nums[i];
        }
        int[] result=new int[nums.length];

        for(int i=0;i<nums.length;i++){

            int leftsum=nums[i]*(i+1)-prefixSum[i];
            int remainingElements= nums.length - i - 1;
            int rightsum=prefixSum[nums.length-1]-prefixSum[i]-(nums[i]*remainingElements);

            result[i]=leftsum+rightsum;
        }
        return result;
        
    }
}

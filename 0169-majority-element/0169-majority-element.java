class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        if(n<=1){
            return nums[0];
        }
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            int count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count=count+1;;
                }

                if(count>n/2){
                    return nums[i];
                }
            }
        }
        return 0;
        
    }
}
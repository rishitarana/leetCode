class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     int count=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count==1){
        //         return nums[i];
        //     }
        // }
        // return -1;
        for(int i=1;i<n;i+=2){
            if(nums[i]!=nums[i-1]){
                return nums[i-1];
            }
        }
        return nums[n-1];

    }
}
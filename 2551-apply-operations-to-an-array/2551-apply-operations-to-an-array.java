class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
            else{
                continue;
            }
        }

        int[] arr1 = new int[nums.length];
        int idx = 0;
        for (int num : nums) {
            if (num != 0) {
                arr1[idx++] = num;
            }
        }
        return arr1;
        
    }
}
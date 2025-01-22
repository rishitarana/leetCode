class Solution {
    public void rotate(int[] nums, int k) {

        int n=nums.length;

        if(nums.length<=1){
            System.out.println(Arrays.toString(nums));
            return;
        }

        k=k%n;
        
        int[] arr = new int[nums.length];
        int idx=0;

        
        for(int i=n-k;i<nums.length;i++){
            arr[idx++]=nums[i];
        }

        for(int i=0;i<n-k;i++){
            arr[idx++]=nums[i];
        }


        int j=0;
        for(int num: arr){
            nums[j++]=num;
        }

        System.out.println(nums);
        
    }
}
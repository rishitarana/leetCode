class Solution {
    public int[] productExceptSelf(int[] nums) {

        int before=1;
        int after=1;

        int arr[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            
            arr[i]=before;
            before*=nums[i];
        }

        for(int i=nums.length-1;i>=0;i--){
            arr[i]*=after;
            after*=nums[i];
        }


        return arr;

       

        
    }
}
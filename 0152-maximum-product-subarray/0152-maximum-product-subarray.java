class Solution {
    public int maxProduct(int[] nums) {

        int product=1;
        int maxProduct=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            product=1;
            for(int j=i;j<nums.length;j++){
                product=product*nums[j];
                maxProduct=Integer.max(product,maxProduct);
            }
        }
        return maxProduct;
    }
}
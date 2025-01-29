class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];

        int postIdx=0,negIdx=1;

        for(int num:nums){
            if(num>=0){
                res[postIdx]=num;
                postIdx+=2;
            }
            else{
                if(num<0){
                    res[negIdx]=num;
                    negIdx+=2;
                }
            }
        }
        return res;
    }
}
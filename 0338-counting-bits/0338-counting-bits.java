class Solution {
    public int[] countBits(int n) {
        int result[]=new int[n+1];
        result[0]=0;
        for(int i=1;i<result.length;i++){
            result[i]=result[i/2]+(i%2);



        }

        return result;
        
    }
}
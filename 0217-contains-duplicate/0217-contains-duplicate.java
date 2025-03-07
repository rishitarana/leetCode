class Solution {
    public boolean containsDuplicate(int[] nums){

      HashSet<Integer> set=new HashSet<>();
      for(int num: nums){
        set.add(num);
      }

    int[] arr=new int[set.size()];
    int idx=0;
    for(int num: set){
        arr[idx++]=num;
    }


    if(arr.length==nums.length){
        return false;
    }
    else{
        return true;
    }
        
    }
}
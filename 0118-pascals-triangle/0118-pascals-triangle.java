class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> list=new ArrayList<>();
         for(int i=1;i<=numRows;i++){
            list.add(pascalTriangle(i));
         }
         return list;
    }

    public static List<Integer> pascalTriangle(int row){
        long ans = 1;
        List<Integer> list1=new ArrayList<>();

        list1.add(1);
        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            list1.add((int)ans);
        }
        return list1;

    }
}
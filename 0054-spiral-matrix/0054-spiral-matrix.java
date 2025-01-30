// import java.util.ArrayList;
// import java.util.List;

// class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {
//         int m = matrix.length;
//         if (m == 0) return new ArrayList<>(); // Handle empty matrix case
//         int n = matrix[0].length;

//         int top = 0, bottom = m - 1;
//         int left = 0, right = n - 1;

//         ArrayList<Integer> list = new ArrayList<>();

//         while (top <= bottom && left <= right) {
//             // Traverse from left to right along the top row
//             for (int i = left; i <= right; i++) {
//                 list.add(matrix[top][i]);
//             }
//             top++;

//             // Traverse from top to bottom along the right column
//             for (int i = top; i <= bottom; i++) {
//                 list.add(matrix[i][right]);
//             }
//             right--;

//             if (top <= bottom) {
//                 // Traverse from right to left along the bottom row
//                 for (int i = right; i >= left; i--) {
//                     list.add(matrix[bottom][i]);
//                 }
//                 bottom--;
//             }

//             if (left <= right) {
//                 // Traverse from bottom to top along the left column
//                 for (int i = bottom; i >= top; i--) {
//                     list.add(matrix[i][left]);
//                 }
//                 left++;
//             }
//         }

//         return list;
//     }
// }


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int m=matrix.length;
        int n=matrix[0].length;

        int top=0 , bottom = m-1;
        int left=0 , right= n-1;
        
       ArrayList<Integer> list=new ArrayList<>();

       while(top<=bottom && left<=right){
    
       //right

       for(int i=left;i<=right;i++){
        list.add(matrix[top][i]);
       }
       top++;

       for(int i=top;i<=bottom;i++){
        list.add(matrix[i][right]);
       }
       right--;

        if(top<=bottom){

       for(int i=right;i>=left;i--){
        list.add(matrix[bottom][i]);
        
       }
       bottom--;
    }

    if(left<=right){

       for(int i=bottom;i>=top;i--){
        list.add(matrix[i][left]);
       }
       left++;

       }
    }
    return list;

        
    }
}
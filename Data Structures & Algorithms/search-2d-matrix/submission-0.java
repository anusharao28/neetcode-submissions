class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

     //brute force
     /*for(int r=0;r<matrix.length;r++){
        for(int c=0;c<matrix.length;c++){
            if(matrix[r][c]==target){
                return true;
            }
        }
        }
        return false;  
        */

        //binary search

        int rowIdx = searchPotentialRow(matrix, target);
    if (rowIdx != -1)
      return binarySearchOverRow(rowIdx, matrix, target);
    return false; 
    }

    private int searchPotentialRow(int[][] matrix, int target) {
    int low = 0;
    int high = matrix.length - 1;
    int idx = matrix[0].length - 1;
    while (low <= high) {
      int mid = low + (high - low)/2;

      if (matrix[mid][0] <= target && target <= matrix[mid][idx]) {
        return mid;
      }
      else if (matrix[mid][0] < target) low = mid + 1;
      else if (matrix[mid][0] > target) high = mid - 1;
    }
    return -1;
  }

  private boolean binarySearchOverRow(int rowIdx, int[][] matrix, int target) {
    int low = 0;
    int high = matrix[rowIdx].length - 1;
    while (low <= high) {
      int mid = low + (high - low)/2;

      if (matrix[rowIdx][mid] == target) {
        return true;
      }
      else if (matrix[rowIdx][mid] > target) high = mid - 1;
      else low = mid + 1;
    }
    return false;
  }
}

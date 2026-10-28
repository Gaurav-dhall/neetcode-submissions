class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n =  matrix[0].length;

        int i=0;
        int j=m-1;

        while(i<=j){
            int mid=i+(j-i)/2;
            if(matrix[mid][0]<target){
                i=mid+1;
                continue;
            }

            if(matrix[mid][0]>target){
                j=mid-1;
                continue;
            }

            return true;


        }

        int row=j;

        int x=0;
        if(row<0){
            return false;
        }
        int y=matrix[row].length-1;

        while(x<=y){
            int mid=x+(y-x)/2;

            if(matrix[row][mid]<target){
                x=mid+1;
                continue;
            }

            if(matrix[row][mid]>target){
                y=mid-1;
                continue;
            }
                return true;

        }

        return false;

        

    }
}

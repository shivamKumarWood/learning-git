public class rotateMatrix {
    public void rotate(int[][] arr) {
        int n=arr.length;
        int col=n-1,top=0,bottom=n-1,left=0,right=n-1;
        for(int i=0;i<n/2;i++){
            for(int j=i;j<col;j++){
                int temp1=arr[j][right];
                arr[j] [right]=arr[top][j];
                int temp2=arr[bottom][n-1-j];
                arr[bottom][n-1-j]=temp1;
                temp1 = arr[n-1-j][left];
                arr[n-1-j][left]=temp2;
                arr[top][j]=temp1;
            }
            col--;right--;bottom--;
            left++;top++;
        }
        
    }
}

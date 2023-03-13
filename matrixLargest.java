public class matrixLargest {
    public static void main(String[] args) {
        int arr[][]= {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int ans = largest(arr);
        System.out.println(ans);

    }
    static int largest(int [][]arr){
        int large =0;
        for(int row =0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>large){
                    large=arr[row][col];
                }
            }
        }
        return large;
    }
}

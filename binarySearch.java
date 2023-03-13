public class binarySearch {
    public static void main(String[] args) {
        int arr[]= {2,33,45,67,78,92,98};
        int target = 2;
       int ans=findNumber(arr,target);
        System.out.println(ans);
    }
    static int findNumber(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}

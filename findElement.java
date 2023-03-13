public class findElement{
    public static void main(String[] args) {
        int arr[]={2,1,66,7,4,99};
        int target=7;
        int ans=findNum(arr,target);
        System.out.print(ans);
    }
    static int findNum(int arr[],int target) {
               for(int i=0;i<arr.length;i++){
                   if(arr[i]==target){
                       return i;
                   }
               }
               return -1;
    }
}
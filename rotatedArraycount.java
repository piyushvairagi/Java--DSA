public class rotatedArraycount {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,8,9,10,1,2,3};
    }
    static int countrotation(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
               return i;
            }
        }
        return -1;
    }
}

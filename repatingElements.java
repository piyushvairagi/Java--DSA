public class repatingElements{
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,4};
        int ans=repeatnum(arr);
        System.out.println(ans);
    }
    static int repeatnum(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
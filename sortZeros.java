import java.util.Arrays;

public class sortZeros {
    public static void main(String[] args) {
        int arr[]={0,1,0,1,0,1,1};
        int zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
        }
        for(int i=0;i<zero;i++){
            arr[i]=0;
        }
        for(int i=zero;i<arr.length;i++){
            arr[i]=1;
        }
        System.out.println(Arrays.toString(arr));
    }
}

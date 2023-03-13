import java.util.Scanner;
import java.util.Arrays;
public class rotateArrayLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int num;
        System.out.print("Enter number of times you want to left rotate array: ");
        num=sc.nextInt();
        for(int i=0;i<num;i++){
            int first=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=first;
        }
        System.out.println(Arrays.toString(arr));
    }
}

import java.util.Arrays;

public class mergeArrays {
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={2,3,4};

        int first = arr1.length;
        int second=arr2.length;
        int third = arr1.length+ arr2.length;

        int arr3[]=new int[third];

        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[arr1.length+i]=arr2[i];
        }
        for(int i=0;i<third;i++){
            Arrays.sort(arr3);
            System.out.print(arr3[i]+" ");
        }
    }
}

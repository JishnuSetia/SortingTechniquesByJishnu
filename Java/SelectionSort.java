import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,23,6,1,5,7,8,20};
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            int min =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

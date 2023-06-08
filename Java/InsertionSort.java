import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,23,6,1,5,7,8,20};
        System.out.println(Arrays.toString(arr));
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                int a = i;
                while(!(a<1)){
                    if(arr[a]>arr[a-1]){
                        break;
                    }
                    int temp = arr[a];
                    arr[a]=arr[a-1];
                    arr[a-1]=temp;
                    a--;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

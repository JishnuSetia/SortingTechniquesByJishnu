import java.util.*;

public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {4,23,6,1,5,7,8,20};
        System.out.println(Arrays.toString(arr));
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
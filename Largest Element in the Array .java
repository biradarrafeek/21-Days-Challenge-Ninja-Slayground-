import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int max = 0;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
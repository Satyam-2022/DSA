package ArraysProblems;

import java.util.Arrays;

public class KthNumber {
    //FOR FINDING Kth SMALLEST NUMBER IN ARRAY
    static void Kthsmallest(int[]arr,int start,int end,int k){
        Arrays.sort(arr,start,end-1);
        System.out.println(arr[k-1]);
    }
    public static void main(String[] args) {
        int []arr={7,10,4,3,20,15};
        Kthsmallest(arr,0,5,3);
    }
}

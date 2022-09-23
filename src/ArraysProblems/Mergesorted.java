package ArraysProblems;

import java.util.Arrays;

public class Mergesorted {
    static void merge(int[]arr1, int[]arr2, int a, int b) {
        for(int i=0;i<a;i++){
            if(arr1[i]>arr2[0]){
                int temp=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=temp;

                int first=arr2[0];
                int j;
                for(j=1;j<b&&arr2[j]<first;j++){
                    arr2[j-1]=arr2[j];
                }arr2[j-1]=first;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        merge(arr1, arr2, arr1.length , arr2.length);
        System.out.print(Arrays.toString(arr1) +" "+ Arrays.toString(arr2));
    }
}

package ArraysProblems;

import java.util.Arrays;

public class sort0s {
    static void sort01(int[]arr,int n){
        Arrays.sort(arr);
    }
    //Duplicates or repeated Numbers
   public static int findDuplicate(int[] nums) {
        boolean []boo = new boolean[nums.length];

        for(int i=0;i<nums.length;i++){
            if(boo[nums[i]]){
                return nums[i];
            }
            boo[nums[i]]=true;
        }
        return -1;
    }

    public static void main(String[] args) {
        int []a={0,2,1,2,0};
        int []arr={1,3,4,2,2,2};
        System.out.println("Duplicate Number: "+findDuplicate(arr));
        sort01(a,5);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

package ArraysProblems;

public class Kadanes {
   static long maxsubarraysum(int []a,int n){
        int curr=0;
      long max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            curr+=a[i];
            if(curr>max){
                max=curr;
            }
            if(curr<0){
                curr=0;
            }
        }
        return  max;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,-2,5};
        int n=5;
        System.out.println(maxsubarraysum(arr,n));
    }
}

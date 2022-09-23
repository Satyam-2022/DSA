package ArraysProblems;

public class rotate1 {
    static void rotate(int arr[], int n)
    {
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;

    }
    static void maxsubarraysum(int[]arr,int r){
        int max=Integer.MIN_VALUE;
        int mxth=0;
        for(int i=0;i<r;i++){
            mxth += arr[i];
            if(mxth>max){
                max=mxth;
                if(mxth<0){
                    mxth=0;
                }
            }
        }
        System.out.print("maxSum is :"+mxth);
    }
    static void print(int[]arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[]arr={9, 8, 7, 6, 4, 2, 1, 3};
        int n=arr.length;
        int[]a={1,2,3,-2,5};
        int m=a.length;
        print(arr,n);
        System.out.println("After rotating by one:");
        rotate(arr,n);
        print(arr,n);
        System.out.println("next");
        print(a,m);
        maxsubarraysum(a,m);

    }
}

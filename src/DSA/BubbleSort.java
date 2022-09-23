package DSA;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr={8,5,7,2,-3,1,0};
        int a= arr.length;

        for(int i=0;i<a-1;i++){
            for(int j=0;j<a-i-1;j++){
                if(arr[j+1]<arr[j]){
                int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int e:arr) {
            System.out.print(e+" ");
        }
    }
}

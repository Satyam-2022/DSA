package ArraysProblems;

public class MinMax {
    //FINDING MINIMUM NUMBER IN ARRAY
    static void Minimum(int[] arr){
        int min=arr[0];
        for(int i=0;i< arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        } System.out.println("Minimum number :"+min);
    }

    //FINDING MAXIMUM NUMBER IN ARRAY
    static void Maximum(int[] arr){
        int max=arr[0];
        for(int i=0;i< arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        } System.out.println("Maximum number :"+max);
    }

    public static void main(String[] args) {
        int []arr={7,10,4,3,20,15};
        Minimum(arr);
        Maximum(arr);
    }
}

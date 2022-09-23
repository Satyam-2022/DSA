package ArraysProblems;

public class MissingN {
    public static void main(String[] args) {
        int n=5;
        int[]a={1,2,3,4,5};
        int sumall=n*(n+1)/2;
        int sum=0;
        //  int sum=Arrays.stream(a).sum();
        for(int i=0;i<n-1;i++){
            sum= sum+a[i];
        }

        int missingNumber = sumall - sum;
        System.out.println(missingNumber);
    }
}

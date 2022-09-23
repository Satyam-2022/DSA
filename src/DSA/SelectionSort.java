package DSA;

public class SelectionSort {
    public static void main(String[] args) {
        int []a={5,2,6,1,3,-8,0};
        int b=a.length;

        for(int i=0;i<b-1;i++){
            int min=i;
            for(int j=i;j<b;j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
                int temp=a[min];
                a[min]=a[i];
                a[i]=temp;
        }
        for (int e:a) {
            System.out.print(e+" ");
        }
    }
}

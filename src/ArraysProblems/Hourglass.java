package ArraysProblems;

import java.util.Scanner;

//  An hour glass is made of 7 cells
//    A B C
//      D
//    E F G
public class Hourglass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int Msum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-2;i++){
            for(int j=0;j<arr[i].length-2;j++){
                int sum=((arr[i][j]+arr[i][j+1]+arr[i][j+2])+
                        (arr[i+1][j+1])+
                        (arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]));
                Msum=Math.max(Msum,sum);
            }
        }
        System.out.println("Maximum sum of hour glass = "+Msum);
    }
}

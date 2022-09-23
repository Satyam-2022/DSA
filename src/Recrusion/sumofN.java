package Recrusion;

import java.util.Scanner;

public class sumofN {
    static int sum(int n){
        if(n==1){
            return 1 ;
        }
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a= scan.nextInt();
        int ans=sum(a);
        System.out.println(ans);
    }
}

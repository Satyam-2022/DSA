package Recrusion;

import java.util.Scanner;

public class hello {
    static  void print(int n){
        if(n==0){
            return ;
        }
        System.out.println("hello");
        print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        print(a);
    }
}

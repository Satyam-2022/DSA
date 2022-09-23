package StringProblems;

import java.util.Scanner;

public class leftrightRotate {
    static String leftrotate(String str,int d){
        return str.substring(d)+str.substring(0,d);
    }
    static String rightrotate(String str,int d){

        return leftrotate(str,str.length()-d);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        System.out.println("LeftRotation:  "+leftrotate(s,n));
        System.out.println("RightRotation:  "+rightrotate(s,n));
    }
}

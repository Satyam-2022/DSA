package StringProblems;

import java.util.Scanner;

public class Duplicate {
    static final int chars=256;
    static void fillchar(String s,int[]a){
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)]++;
        }
    }
    static void printdups(String s){
        int[]a=new int[chars];
        fillchar(s,a);

        for(int i=0;i<chars;i++){
            if(a[i]>1){
                System.out.println((char)(i)+", count ="+a[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :");
        String s=sc.nextLine();
        printdups(s);
    }
}

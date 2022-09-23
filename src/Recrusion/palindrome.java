package Recrusion;

import java.util.Scanner;

public class palindrome {
    static boolean pal(String s,int start,int end){
        if(start>=end){
            return true;
        }
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        return pal(s,start+1,end-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(pal(s,0,s.length()-1));
    }
}

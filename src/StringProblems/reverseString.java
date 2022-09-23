package StringProblems;

import java.util.Stack;

public class reverseString {
    static void reverse(String s){
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i)+" ");
        }
    }
    static void usingStack(String s){
       // String s="GeeksforGeeks";
        String a="";
        Stack<Character> p=new Stack<>();
        for(int i=0;i<s.length();i++){
            p.push(s.charAt(i));
        }
        for(int i=s.length();i>0;i--){
            a=a+p.pop();
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        String s ="Hello";
        //swapping and reversing
        char[] ch= new char[]{'H','e','l','l','o'};
        int left =0;
        int right=ch.length-1;
        while (left<right){
            char temp=ch[left];
            ch[left++]=ch[right];
            ch[right--]=temp;
        }
        System.out.print(ch);
        System.out.println();
        reverse(s);
        System.out.println();
        usingStack(s);
    }
}

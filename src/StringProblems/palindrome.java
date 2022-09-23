package StringProblems;

import java.util.Scanner;

public class palindrome {
     static void ispalindrome(String s){
         String reverse="";
         int l= s.length();
         for(int i=l-1;i>=0;i--){
             reverse=reverse + s.charAt(i);
         }
         if(s.toLowerCase().equals(reverse.toLowerCase())){
             System.out.println("Palindrome");
         }else{
             System.out.println("Not Palindrome");
         }
     }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :");
        String s=sc.nextLine();
       ispalindrome(s);
    }
}

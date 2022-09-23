package StringProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static void isAnagram(String a,String b){
        char[] c1 =a.toCharArray();
        char[] c2 =b.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1,c2)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String f=sc.nextLine();
        String g=sc.nextLine();
        isAnagram(f,g);

    }
}

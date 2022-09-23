package StringProblems;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {
    static boolean ispar(String x){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<x.length();i++){
            char c=x.charAt(i);
            if(c=='(' || c=='{' || c=='[')
            {
                s.push(c);
            }
            else
            {
                if(!s.empty())
                {
                    char top=s.peek();
                    if(top=='(' && c==')' || top=='{' && c=='}' ||top=='[' && c==']' )
                    {
                        s.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
        }
        if(s.size()==0)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x= sc.nextLine();
        System.out.println(ispar(x));
    }
}

package Recrusion;

public class powerset {
    static void pow(String s,int i,String curr){
        if(i==s.length()){
            System.out.println(curr);
            return;
        }
        pow(s,i+1,curr+s.charAt(i));
        pow(s,i+1,curr);
    }
    public static void main(String[] args) {
        String s="abc";
        String b="";
        int a=0;
        pow(s,a,b);
    }
}

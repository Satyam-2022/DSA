package com.JusticLeague;

import java.util.Random;

public class NewClass {
    static char [] otp_Password(int len){
        System.out.println("Generating password using random() : ");
        System.out.print("Your new password is : ");

        String Capital_chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars="abcdefghijklmnopqrstuvwxyz";
        String numbers="0123456789";
        String symbol="!@#$%^&*_=+-/.?<>)";

        String values=Capital_chars+Small_chars+numbers+symbol;
        Random rndm_method=new Random();
        char[]password=new char[len];
        for(int i=0;i<len;i++){
            password[i]=values.charAt(rndm_method.nextInt(values.length()));
        }
        return password;
    }

    public static void main(String[] args) {
        int length=10;
        System.out.println(otp_Password(length));
    }
}

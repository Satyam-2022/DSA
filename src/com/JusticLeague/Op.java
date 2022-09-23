package com.JusticLeague;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Op {
    public static void main(String[] args) throws IOException {
        FileOutputStream file=null;

        try {
            String s="The JAva Class";
            file=new FileOutputStream("C:\\Users\\jarvis\\Desktop\\java.txt");
            byte a[]=s.getBytes();
            file.write(a);
            System.out.println("Check your txt file");

        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
        finally {
            file.close();
        }
    }
}

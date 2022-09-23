package com.JusticLeague;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Vector {


    public static void main(String[] args) throws IOException {
        FileInputStream fil=null;
        Scanner sc=null;

        try {
            fil=new FileInputStream("C:\\Users\\jarvis\\Desktop\\java.txt");
            sc=new Scanner(fil);
           while (sc.hasNextLine()){
               System.out.println(sc.nextLine());
           }
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
        finally {
          fil.close();

        }
    }
}

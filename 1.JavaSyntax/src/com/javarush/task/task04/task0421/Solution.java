package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int a1 = a.length();
        String b = reader.readLine();
        int b1 = b.length();


        if (a.equals(b)) System.out.println("Имена идентичны");
        else if (a1==b1) System.out.println("Длины имен равны");


        //напишите тут ваш код
    }
}

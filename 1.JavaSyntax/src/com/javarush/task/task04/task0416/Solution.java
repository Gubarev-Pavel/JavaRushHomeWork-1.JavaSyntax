package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());
        if ((t%5)< 3.0) System.out.println("зелёный");
        else if ((t%5)< 4.0) System.out.println("жёлтый");
        else if ((t%5)< 5.0) System.out.println("красный");


    }
}

        //напишите тут ваш код
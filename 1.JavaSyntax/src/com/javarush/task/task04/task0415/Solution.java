package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String aS = reader.readLine();
            String bS = reader.readLine();
            String cS = reader.readLine();
            int a = Integer.parseInt(aS);
            int b = Integer.parseInt(bS);
            int c = Integer.parseInt(cS);
        if (a+b>=c || b+c>=a || c+a>=b){
            System.out.println("Треугольник существует.");}

        else 
        {   System.out.println("Треугольник не существует.");
        } //напишите тут ваш код
    }
}
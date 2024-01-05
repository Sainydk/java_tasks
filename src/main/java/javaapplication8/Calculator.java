/*Задача 1.1.7-c (Тема 4). Проведите вычисления

x = 10, y = 20;

z = sqrt (y-x);

z = z +1;*/

package javaapplication8;

public class Calculator {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println(Math.sqrt(y - x) + 1);
    }
}
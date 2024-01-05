/*Задача 1.1.7-d (Есть в учебнике, тема 4). Проведите вычисления:

x = 30, y = 40;

z = |40-30| //модуль убирает знак минус у числа. Он оставляет положительные числа такими же, а отрицательные делает положительными. В Java это Math.abs ().

z = z*z;*/

package javaapplication8;

public class Calculator {
    public static void main(String[] args) {
        int x = 30;
        int y = 40;
        System.out.println((y - x) * (y - x));
    }
}
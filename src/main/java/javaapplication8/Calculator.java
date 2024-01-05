/*Задача 1.1.6 (Тема 4). Объявите 2 переменных типа double со значениями
x = 0.25, y = 0.9;
Посчитайте выражения, каждый раз выводя их на экране:
10*x + y
y * sqrt (x)
возведите x в степень y и затем вычтите 1*/

package javaapplication8;

public class Calculator {
    public static void main(String[] args) {
        double a = 0.25;
        double b = 0.9;

        System.out.println(10 * a + b);
        System.out.println(b * Math.sqrt(a));
        System.out.println(Math.pow(a, b) - 1);
    }
}
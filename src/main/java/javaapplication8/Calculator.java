/*Задача 1.1.7-b (Тема 4).
Пусть x = 5, y = 10;
Выведите на экран sqrt (x*x + y*y);
Это и есть гипотенуза треугольника со сторонами x, y.*/

package javaapplication8;

public class Calculator {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        System.out.println(Math.sqrt((x * x) + (y * y)));
    }
}
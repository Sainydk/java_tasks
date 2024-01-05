/*Задача 1.1.9 (тема 5). Исправьте ошибки в коде:
а) int x = 20 //должно быть объявление переменной икс = 20
    int x = x + 50; //должно быть увеличить икс на 50
б) u = 100; //должно быть объявление переменной u = 100
    int m = u * 2; // //должно быть объявление переменной m в два раза больше u
в) int k = (1 / 5) * 1000; //исправьте, чтобы результат не обнулялся.*/

package javaapplication8;

public class Calculator {
    public static void main(String[] args) {
        int x = 20;
        x = x + 50;
        int u = 100;
        int m = u * 2;
        int k = (1 / 5) * 1000;

        System.out.println(x);
        System.out.println(m);
        System.out.println(k);
    }
}
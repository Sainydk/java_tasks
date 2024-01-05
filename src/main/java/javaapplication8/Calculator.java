/*Задача 1.1.3 (Тема 5). Запустите код. Подумайте, почему программа выдаст отрицательное число вместо двух миллиардов:*/

package javaapplication8;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Привет!");

        System.out.println(Integer.MAX_VALUE);

        int z = 2147483647 + 1;
        System.out.println(z);
        long y = 2147483647l + 1;
        System.out.println(y);
    }
}
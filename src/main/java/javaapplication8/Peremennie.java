/*Задача 1.1.5 (Тема 5). Объявите 10 переменных типа int со значениями 0,1, 2, 3, 4, 5, 6, 7, 8, 9.
Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 10.
Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
Распечатайте её через println. Сколько программа отбросила в дробной части?
Сравните со значением double.*/

package javaapplication8;

public class Peremennie {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        int f = 5;
        int g = 6;
        int h = 7;
        int i = 8;
        int j = 9;

        int l = (a + b + c + d + e + f + g + h + i + j) / 10;
        double m = (a + b + c + d + e + f + g + h + i + j) / 10;

        System.out.println(l);
        System.out.println(m);
    }
}

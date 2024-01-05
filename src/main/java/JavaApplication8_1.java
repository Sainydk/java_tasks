/*Задача 1.1.2-b Посчитайте выражения, выведите их на экран и убедитесь, что результат действительно правильный:*/

public class JavaApplication8_1 {
    public static void main(String[] args) {
        int x = 5, y = 7, z = 0;

        z = x * x + y * y;
        System.out.println(z);
        z = x * x * x;
        System.out.println(z);
        z = x / 1; // делить на ноль нельзя и будет ошибка.
// Запомните, как она выглядит, и в будущем, обнаружив такую, будете знать,
// куда копать, чтобы исправить программу
        System.out.println(z);
    }
}

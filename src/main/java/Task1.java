import java.util.Scanner;

public class Task1 {
    private static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.println("Выберите программу: 1 - Поиск максимального элемента в массиве. 2 - Калькулятор : ");
        int task = in.nextInt();
        if (task == 1)
            findingMaximumElement();
        else if (task == 2)
            calculations();
        else
            System.out.println("Такого задания нету!");
        in.close();
    }

    /**
     * Поиск максимального элемента в массиве
     */
    private static void findingMaximumElement() {
        System.out.print("Введите длину массива: ");
        int length = in.nextInt();
        String[] mass = new String[length];
        in.nextLine();
        for (int i = 0; i < mass.length; i++) {
            System.out.print("Введите " + (i + 1) + " слово в массиве: ");
            mass[i] = in.nextLine();
        }
        System.out.println("Самое длинное слово в массиве: " + maxWord(mass));
    }

    /**
     * Вычисления по поиску
     */
    private static String maxWord(String[] mass) {
        String word = mass[0];
        for (String val : mass) {
            if (val.length() > word.length())
                word = val;
        }
        return word;
    }

    /**
     * Метод калькулятора
     */
    private static void calculations() {
        System.out.print("Введите 1 значение: ");
        Double a = in.nextDouble();
        System.out.print("Введите 2 значение: ");
        Double b = in.nextDouble();
        System.out.println("Введите оператор: ");
        String operator = in.next();
        System.out.printf("%.4f", calculator(a, b, operator));
    }

    /**
     * Метод вычисления
     */
    private static double calculator(Double a, Double b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                System.out.println("Невалидный оператор!");
                return -100;
        }
    }
}

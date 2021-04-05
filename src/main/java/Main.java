import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 1 значение: ");
        Double a = in.nextDouble();
        System.out.print("Введите 2 значение: ");
        Double b = in.nextDouble();
        System.out.println("Введите оператор: ");
        String operator = in.next();
        System.out.printf("%.4f", calculator(a, b, operator));
    }

    /**
     * Метод калькулятора
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

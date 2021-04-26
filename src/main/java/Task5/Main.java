package Task5;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.addition(0.12, 0.22));
        try {
            Double result = calc.division(0.23, 0.0);
        } catch (DivisionException e) {
            e.printStackTrace();
        }
    }
}

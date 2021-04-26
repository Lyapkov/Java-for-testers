package Task5;

public class Calculator implements Division, Multiplication, Subtraction, Addition {
    @Override
    public Double addition(Double a, Double b) {
        return a + b;
    }

    @Override
    public int addition(int a, int b) {
        return a + b;
    }

    @Override
    public Double division(Double a, Double b) throws DivisionException {
        if (b != 0)
            return a / b;
        else
            throw new DivisionException();
    }

    @Override
    public Double division(int a, int b) throws DivisionException {
        if (b != 0)
            return (double) a / b;
        else
            throw new DivisionException();
    }

    @Override
    public Double multiplication(Double a, Double b) {
        return a * b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }

    @Override
    public Double subtraction(Double a, Double b) {
        return a - b;
    }
}

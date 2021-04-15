package Task4_2;

public class Candy extends Present {
    int count;

    public Candy(String name, Double weight, Double price, int count) {
        super(name, weight, price);
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void info() {
        super.info();
        System.out.println(", количество " + count);
    }
}

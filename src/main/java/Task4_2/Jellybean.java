package Task4_2;

public class Jellybean extends Present {
    String manufacturer;

    public Jellybean(String name, Double weight, Double price, String manufacturer) {
        super(name, weight, price);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void info() {
        super.info();
        System.out.println(", производитель " + manufacturer);
    }
}

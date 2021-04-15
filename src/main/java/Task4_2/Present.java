package Task4_2;

public abstract class Present {
    String name;
    Double weight;
    Double price;

    public Present(String name, Double weight, Double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public void info() {
        System.out.print("Имя подарка " + name + ", вес подарка " + weight + ", цена подарка " + price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

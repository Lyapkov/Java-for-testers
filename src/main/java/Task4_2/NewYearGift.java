package Task4_2;

import java.util.ArrayList;
import java.util.List;

public class NewYearGift {
    private ArrayList<Present> bag = new ArrayList<Present>();

    public Double getWeight() {
        Double weight = 0.0;
        for (Present value : bag) {
            weight += value.getWeight();
        }
        return weight;
    }

    public Double getPrice() {
        Double price = 0.0;
        for (Present value : bag) {
            price += value.getPrice();
        }
        return price;
    }

    public void addPresent(Present present) {
        bag.add(present);
    }

    public void info() {
        for (Present present: bag) {
            present.info();
        }
    }

    public List<Present> getBag() {
        return bag;
    }
}

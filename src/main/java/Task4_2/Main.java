package Task4_2;

public class Main {
    public static void main(String[] args) {
        NewYearGift bag = new NewYearGift();
        bag.addPresent(new Candy("Рачки", 1.5, 2.3, 100));
        bag.addPresent(new Jellybean("Жвачка", 1.5, 2.3, "Жвачачная"));
        bag.info();
        System.out.println("Общий вес мешка: " + bag.getWeight());
        System.out.println("Общая стоимость мешка: " + bag.getPrice());
    }
}

public class Task4_1 {
    public static void main(String[] args) {
        int[] array = random();
        calculator(array);
    }

    private static int[] random() {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 21) - 10;
        }
        return array;
    }

    private static void calculator(int[] array) {
        int min = 10;
        int max = -10;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && array[i] > max) max = array[i];
            else if (array[i] > 0 && array[i] < min) min = array[i];
        }
        print(array, min, max);
    }

    private static void print(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println(min + " " + max);
    }
}

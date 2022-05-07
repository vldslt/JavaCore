package HomeWorkApp6;

public class Cat extends Animal {
    private final int MAX_RUN_LENGTH = 200;
    private final int MAX_SWIMMING_LENGTH = 0;
    private static int countCat;
    public static int getCountCat() {
        return countCat;
    }
    public Cat (String name) {
        super(name);
        countCat++;
    }
    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("run: true");
        else System.out.println("run: false");
    }

    @Override
    void swimming(int length) {
        System.out.println("swim: false");
    }
}

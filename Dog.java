package HomeWorkApp6;

public class Dog extends Animal {
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIMMING_LENGTH = 10;
    private static int countDog;
    public static int getCountDog() {
        return countDog;
    }



    public Dog (String name) {
        super(name);
        countDog++;
    }
    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("run: true");
    }

    @Override
    void swimming(int length) {
        if ((length >= 0) && (length <= MAX_SWIMMING_LENGTH)) System.out.println("swim: true");
        else System.out.println("swim: false");
    }
}

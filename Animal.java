package HomeWorkApp6;

public abstract class Animal {
    private final int MAX_RUN_LENGTH = 0;
    private final int MAX_SWIMMING_LENGTH = 0;

    abstract void run(int length);

    abstract void swimming(int length);

    private String name;
    private static int countAnimals;

    public static int getCountAnimals() {
        return countAnimals;
    }


    public Animal(String name) {
        name = name;
        countAnimals++;
    }
}

package lesson7;

import java.util.concurrent.ThreadLocalRandom;

public class Cat {
    private String name;


    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate p) {
        p.decreaseFood(ThreadLocalRandom.current().nextInt(4) + 3);
        System.out.println("Котик покушол рыбов");
    }

    public boolean appetite (int catAppetit, int catEatFoodCount) {
        if (catAppetit == catEatFoodCount) {
            System.out.println("котик довольный идёт спать");
        } else if (catAppetit < catEatFoodCount) System.out.println("котик хочет есть дальше");
        return false;
    }
}

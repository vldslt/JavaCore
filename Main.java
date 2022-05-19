package lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat ("Kit");
        Plate plate = new Plate(15);

        plate.info();

        while (plate.getFoodCount() > 0 ) {
            cat.eat(plate);
            plate.info();
            if (plate.getFoodCount() <= 0) {
                System.out.println("еда кончилась");
            }
            Thread.sleep(1000);

        }

        cat.appetite(2, 3);

    }
}

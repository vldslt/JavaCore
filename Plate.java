package lesson7;

import java.util.Scanner;

public class Plate {
    private int foodCount;
    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }
    public static Scanner sc = new Scanner(System.in);

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }

    public void info() {
        System.out.println(this);
    }
    @Override
    public String toString(){
        return "В миске осталось - " + foodCount + " рыбов";
    }

    public void decreaseFood(int catEatFoodCount) {
        foodCount -= catEatFoodCount;
    }
    public int getFoodCount() {
        if (foodCount >= 0) {
            return foodCount;
        } else {

            System.out.println("котейка ест миску!11!! надо доложить еды!!");
            moreFood();
        }
        return 0;
    }

    public static void moreFood() {
        int number;
        System.out.println("сколько рыбов добавим для котиков? ");
        number = sc.nextInt();
        System.out.println("вот перерь все должны остаться довольны");
        sc.close();
    }
}
package lesson07;

import java.util.Scanner;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("В тарелке " + food + " еды");
    }

//    @Override
//    public String toString() {
//        return "Plate{" +
//                "food=" + food +
//                '}';
//    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int appetite) {
        this.food -= appetite;
    }

    public void addFood(int foodCount) {
        this.food += foodCount;
    }

    public boolean isFoodEnough(int foodCount) {
        return getFood() >= foodCount;
    }


    public void addFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберите, сколько еды добавить в тарелку: ");
        int foodCount = scanner.nextInt();
        addFood(foodCount);
    }
}
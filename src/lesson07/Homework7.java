package lesson07;

import java.util.Scanner;

public class Homework7 {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Viskas", 4),
                new Cat("Kruasan", 7),
                new Cat("Niga", 3)
        };

        Plate plate = new Plate(15);

        printInfo(cats, plate);
        haveLunch(cats, plate);
        printInfo(cats, plate);
        addFood(plate);
        System.out.print("Добавлено еды: ");
        plate.info();
        System.out.println();

        haveLunch(cats, plate);
        printInfo(cats, plate);


    }

    private static void addFood(Plate plate) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберите, сколько еды добавить в тарелку: ");
        int foodCount = scanner.nextInt();
        plate.addFood(foodCount);
    }

    private static void printInfo(Cat[] cats, Plate plate) {
        System.out.println("--- Info ---");
        plate.info();
        printInfo(cats);
        System.out.println("------");
        System.out.println();
    }

    private static void haveLunch(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            boolean result = cat.eat(plate);
            System.out.printf("Кот '%s' поел? Answer: %s%n", cat.getName(), result);
        }
        System.out.println();
    }

    private static void printInfo(Cat... cats) {
        for (Cat cat : cats) {
            System.out.printf("Кот '%s(appetite: %d)' голоден? Answer: %s%n",
                    cat.getName(),
                    cat.getAppetite(),
                    !cat.isSatiety());
        }
    }
}

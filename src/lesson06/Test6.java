package lesson06;

//import java.util.Arrays;

import java.util.Random;

public class Test6 {

    public static void main(String[] args) {
        // Создаем профиль животного
         Cat cat1 = new Cat("Barsik",2,0,0); //задаем максимальные значения
         Dog dog1 = new Dog("Jack",0,0,0);
         Dog dog2 = new Dog("Muhtar",0,0,0);
         Cat cat2 = new Cat ("Kruasan", 0,0,0);

         cat1.catInfo();
         cat2.catInfo();
         dog1.dogInfo();
         dog2.dogInfo();
//        System.out.println(dog1);
//        System.out.println(cat1);
        cat1.tryToRun(150);
        dog1.tryToRun(25);
        cat1.tryToSwim(1);
        dog2.tryToJump(0.4);
        cat2.tryToJump(1.8);
    }

}

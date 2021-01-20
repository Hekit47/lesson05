//package lesson07;
//
//import java.util.Random;
//
//public class Cat {
//    private final String name;
//    private int appetite;
//    private boolean satiety;
//
//    public Cat(String name, int appetite) {
//        this.name = name;
//        this.appetite = appetite;
//    }
//
//    public boolean eat(Plate plate) {
//        String validateMessage = checkEat(plate);
//        if (validateMessage != null) {
//            System.out.println(validateMessage);
////            plate.addFood();
////            doEat(plate);
//            return false;
//        }
//
//        doEat(plate);
//        satiety = true;
//        return true;
//    }
//
//    private String checkEat(Plate plate) {
//        if ( !plate.isFoodEnough(appetite) ) {
//            return "Мало еды!";
//        }
//        if (satiety) {
//            return "Кот не хочет кушать";
//        }
//
//        return null;
//    }
//
//    private void doEat(Plate plate) {
//        plate.decreaseFood(appetite);
//    }
//
//    public int getAppetite() {
//        return appetite;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public boolean isSatiety() {
//        return satiety;
//    }
//
//
//}
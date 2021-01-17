package lesson06;

import java.util.Random;

//родительский класс с идентичными параметрами для всех животных
public class Animal {

    protected String name;
    protected double jump;
    protected int run;
    protected int swim;


    public Animal(String name, double jump, int run, int swim) {

        this.name = name;
        this.jump = jump;
        this.run = run;
        this.swim = swim;
    }

    public void voice() {
        System.out.println("Ку!");
    }

    public boolean tryToRun(int m) {
        if (m <= run) {
            System.out.println(name + " ran " + m + " metres");
            return true;
        }
        System.out.println(name + "  can't run " + m + " metres, because of run range= " + run + " metres");
        return false;
    }

    public boolean tryToJump(double h) {
        if (h <= jump) {
            System.out.println(name + " jump " + h + " metres");
            return true;
        }
        System.out.println(name + "  can't jump " + h + " metres, because of jump range= " + jump + " metres");
        return false;
    }

    public boolean tryToSwim(int sm) {
        if (sm <= swim) {
            System.out.println(name + " swam " + sm + " metres");
            return true;
        } else if (swim == 0) {
            System.out.println(name + "  can't swim");
        } else {
            System.out.println(name + "  can't swim " + sm + " metres, because of run range= " + swim + " metres");
        }
            return false;

    }
//    private final String name;
//    private final String color;
//    private final int age;
//
//    public Animal(String name, String color, int age){
//        this.name=name;
//        this.color=color;
//        this.age=age;
//    }
//
//    public void Animalinfo(){
//        System.out.println("Name: " + name);
//        System.out.println("Color: " + color);
//        System.out.println("Age: " + age);
//    }
//
//     public void jump(){
//        System.out.println(name + " jumps");
//     }
}

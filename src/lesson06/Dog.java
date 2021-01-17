package lesson06;

import java.util.Random;

public class Dog extends Animal{

    public Dog(String name, double jump, int run, int swim) {
        super(name, jump, run, swim);
        double[] arr = new double[5];
        arr[0] = 0.1;
        for (int i = 1; i < arr.length; i++) {
            arr[i]= (double)Math.round((arr[i-1] +0.1)*100)/100;
        }
        Random randJump = new Random();
        this.jump = arr[randJump.nextInt(5)]; // задал максимальную величину прыжка, которая будет варьироваться при создании нового животного
        Random randRun = new Random();
        this.run = randRun.nextInt(500); // максимальная длина бега
        Random randSwim = new Random();
        this.swim = randSwim.nextInt(10); // максимальная длина плывка
    }

    public void dogInfo() {
        System.out.println("Dog " + name);
        if (jump > 0){
            System.out.println("Jump range: " + jump + " meteres");
        } else {
            System.out.println("Dog can'not jump");
        }
        System.out.println("Run range: " + run + " meteres");
        if (swim == 0){
            swim++;
        }
        System.out.println("Swim range: " + swim + " meters");
        System.out.println("_______________________");
    }

    @Override
    public String toString(){
        return "Dog{"
                + "name= '" + name + '\''
                + ", Jump range= '" + jump + '\''
                + ", run range= '" + run + '\''
                + " swim range= '" + swim
                + '}';
    }
}


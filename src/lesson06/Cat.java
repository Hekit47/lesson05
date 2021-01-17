package lesson06;

import java.util.Random;

public class Cat extends Animal{

    public Cat(String name, double jump, int run, int swim) {
        super(name, jump, run, swim);
        double[] arr = new double[21];
        arr[0] = 0.1;
        for (int i = 1; i < arr.length; i++) {
            arr[i]= (double)Math.round((arr[i-1] +0.1)*100)/100; //округление
            //double roundOff = Math.round(arr[i]*100)/100;
            }
        Random randJump = new Random();
        this.jump = arr[randJump.nextInt(21)]; // задал максимальную величину прыжка, которая будет варьироваться при создании нового животного
        Random randRun = new Random();
        this.run = randRun.nextInt(200); // максимальная длина бега
        swim = 0;
        this.swim = swim;
    }

    public void catInfo() {
        System.out.println("Cat " + name);
        if (jump > 0){
            System.out.println("Jump range: " + jump + " meteres");
        } else {
            System.out.println("Cat can'not jump");
        }
        System.out.println("Run range: " + run + " meteres");
        swim = 0;
        System.out.println("Cat can'not swim!");
        System.out.println("_______________________");
    }

//    public boolean tryToRun(int m){
//        if (m < run){
//            System.out.println("Cat " + name +  " ran " + m + " metres");
//            return true;
//        }
//        System.out.println("Cat " + name +  "  couldn't ran " + m + " metres, because cat's run range= " + run + " metres");
//        return false;
//    }

    @Override
    public String toString(){
        return "Cat{"
                + "Name= '" + name + '\''
                + ", jump range= '" + jump + '\''
                + ", run range= '" + run + '\''
                + " swim range= '" + swim
                + '}';
    }
}


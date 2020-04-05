package Laborator_5.Task;

import java.util.Random;

public class RandomOutTask implements Task {

    double number;

    public RandomOutTask(){
        Random random = new Random();
        number = random.nextDouble();
    }

    @Override
    public void performTask() {
        System.out.println(number);
    }
}

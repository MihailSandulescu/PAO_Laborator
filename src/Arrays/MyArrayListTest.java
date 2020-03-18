package Arrays;

import java.util.Random;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList customArr = new MyArrayList();
        MyArrayList scenarioArr = new MyArrayList(5);

        customArr.add(11);
        customArr.add(12.6);
        customArr.add(19.01);

        System.out.println("Index 0: " + customArr.get(0));
        System.out.println("Index 1: " + customArr.get(1));
        System.out.println("Index 2: " + customArr.get(2));

//        Random random = new Random();
//        random.setSeed(10);
//
//        for(int i = 1; i <= 10; i++){
//            scenarioArr.add(random.nextDouble());
//        }

        for(int i = 1; i <= 10; ++i) {
            scenarioArr.add(i+10);
        }

        System.out.println(scenarioArr.toString());

        if(scenarioArr.contains(11)) {
            System.out.println("Array contains 11");
        } else {
            System.out.println("It does not contain 11");
        }
        if(scenarioArr.contains(121)) {
            System.out.println("Array contains 121");
        } else {
            System.out.println("It does not contain 121");
        }
        if(scenarioArr.contains(12)) {
            System.out.println("Array contains 12");
        } else {
            System.out.println("It does not contain 12");
        }
        if(scenarioArr.contains(5551)) {
            System.out.println("Array contains 5551");
        } else {
            System.out.println("It does not contain 5551");
        }
        if(scenarioArr.contains(123121)) {
            System.out.println("Array contains 123121");
        } else {
            System.out.println("It does not contain 123121");
        }

        scenarioArr.remove(1);
        scenarioArr.remove(3);
        scenarioArr.remove(4);
        scenarioArr.remove(2);
        scenarioArr.remove(4);

        System.out.println(scenarioArr.toString());

    }
}

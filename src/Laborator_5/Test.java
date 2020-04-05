package Laborator_5;

import Laborator_5.Container.Container;
import Laborator_5.Container.ContainerLIFO;
import Laborator_5.Task.CounterOutTask;
import Laborator_5.Task.RandomOutTask;
import Laborator_5.Task.Task;

public class Test {
    public static void main(String[] args) {
        Task counter = new CounterOutTask();
        Task random = new RandomOutTask();

        Container container = new ContainerLIFO();

        container.addTask(counter);
        container.addTask(random);

        counter.performTask();
        counter.performTask();

        container.getTask(0).performTask();
        container.getTask(0).performTask();

        counter.performTask();
    }
}

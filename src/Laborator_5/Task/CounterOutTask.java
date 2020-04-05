package Laborator_5.Task;

public class CounterOutTask implements Task {

    static int contor;

    static {
        contor = 0;
    }

    public CounterOutTask(){}

    @Override
    public void performTask() {
        ++contor;
        System.out.println(contor);
    }
}

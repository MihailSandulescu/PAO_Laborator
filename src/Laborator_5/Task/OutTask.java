package Laborator_5.Task;

public class OutTask implements Task {

    private String message;

    public OutTask(){
        message = "";
    }
    public OutTask(String message) {
        this.message = message;
    }

    @Override
    public void performTask() {
        System.out.println(message);
    }
}

package Laborator_5.Container;

import Laborator_5.Task.Task;

import java.util.ArrayList;

public class ContainerLIFO implements Container {

    private ArrayList<Task> stack;

    public ContainerLIFO(){
        stack = new ArrayList<Task>();
    }

    @Override
    public void addTask(Task task) {
        stack.add(task);
    }

    @Override
    public void removeTask() {
        stack.remove(stack.size());
    }

    @Override
    public Task getTask(int index) {
        //returns a reference to the task in the arraylist, should return a copy
        //being only for test purposes, i did not implement a constructor in tHe task class that offers
        //such a functionality :)
        return stack.get(index);
    }
}

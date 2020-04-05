package Laborator_5.Container;

import Laborator_5.Task.Task;

import java.util.ArrayList;

public class ContainerFIFO implements Container {
    private ArrayList<Task> queue;

    public ContainerFIFO(){
        queue = new ArrayList<Task>();
    }

    @Override
    public void addTask(Task task) {
        queue.add(task);
    }

    @Override
    public void removeTask() {
        queue.remove(0);
    }

    @Override
    public Task getTask(int index) {
        //returns a reference to the task in the arraylist, should return a copy
        //being only for test purposes, i did not implement a constructor in tHe task class that offers
        //such a functionality :)
        return queue.get(index);
    }
}

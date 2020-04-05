package Laborator_5.Container;

import Laborator_5.Task.Task;

public interface Container {

    void addTask(Task task);
    void removeTask();
    Task getTask(int index); //testing purposes
}

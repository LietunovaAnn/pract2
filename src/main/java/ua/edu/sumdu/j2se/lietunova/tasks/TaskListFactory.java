package ua.edu.sumdu.j2se.lietunova.tasks;

public class TaskListFactory {

    public static AbstractTaskList createTaskList(ListTypes.types type) {
        if (type == ListTypes.types.ARRAY) {
            return new ArrayTaskList();
        }
        return new LinkedTaskList();
    }
}

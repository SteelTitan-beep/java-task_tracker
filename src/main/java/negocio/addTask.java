package negocio;

import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(
        name = "add",
        description = "It adds a task."
)

public class addTask implements Runnable {

    @Parameters(paramLabel = "task", description = "Task to be added.")
    private String task;

    @Override
    public void run() {
        System.out.println("Task added: " + task);
    }

}
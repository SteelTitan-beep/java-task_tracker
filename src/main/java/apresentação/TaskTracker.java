package apresentação;

import negocio.addTask;
import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
        name = "task",
        description = "TaskTracker CLI",
        version = "TaskTracker 1.0",
        subcommands = {addTask.class},
        mixinStandardHelpOptions = true

)

public class TaskTracker implements Runnable{

    @Override
    public void run() {
        System.out.println("Digite ");
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new TaskTracker()).execute(args);
        System.exit(exitCode);
    }

}

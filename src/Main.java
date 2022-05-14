import ru.ufa.OnTaskDoneListener;
import ru.ufa.OnTaskErrorListener;
import ru.ufa.Worker;

public class Main {

    public static void main(String[] args) {
        // OnTaskDoneListener listener = x -> System.out.println(x);
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = () -> System.out.println(" is error");

        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
}
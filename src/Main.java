import sémaphore.Counter;
import sémaphore.Thread1;
import sémaphore.Thread2;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread1(counter);
        Thread thread2 = new Thread2(counter);

        thread1.setName("Pair");
        thread2.setName("Impair");

        thread1.start();
        thread2.start();


    }
}

package sémaphore;

import sémaphore.Counter;

public class Thread2 extends Thread {
    private Counter counter;

    public Thread2(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (true) {
            try {
                counter.incrementImpair();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

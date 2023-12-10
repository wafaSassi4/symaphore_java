package sémaphore;

import sémaphore.Counter;

public class Thread1 extends Thread {
    private Counter counter;

    public Thread1(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (true) {
            try {
                counter.incrementPair();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

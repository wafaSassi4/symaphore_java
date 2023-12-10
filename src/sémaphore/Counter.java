package sémaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int count = 0;

    private final Semaphore semaphore = new Semaphore(1, true);


    public void incrementImpair() throws InterruptedException {
        while (count<10){
            try {
                semaphore.acquire();
                if(count%2!=0){
                    System.out.println("Thread " + Thread.currentThread().getName() + " : " + count);
                    count++;
                }

            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }  finally {
                semaphore.release();
            }
        }
    }

    public void incrementPair() throws InterruptedException {
        while (count<10){
            //lock.lock();

            try {
                semaphore.acquire();
                if (count % 2 == 0) {

                    System.out.println("Thread " + Thread.currentThread().getName() + " : " + count);
                    count++;
                }
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                //lock.unlock();
                semaphore.release();
            }
        }
    }
}

package lesson_3.task_2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private static int counter = 0;
    private static Lock locker = new ReentrantLock();

    public static int getCounter() {
        locker.lock();
        try{
            return counter;
        } finally {
            locker.unlock();
        }
    }

    public static void increase(){
        locker.lock();
        counter++;
        try {
            locker.newCondition().await(200, TimeUnit.MICROSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
        }
    }
}

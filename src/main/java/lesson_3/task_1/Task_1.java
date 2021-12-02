package lesson_3.task_1;

public class Task_1 {
    public synchronized void print(String str) throws InterruptedException {
        System.out.println(str + " - поток " + Thread.currentThread().getName());
        Thread.sleep(100);
    }

    public static void main(String[] args) throws InterruptedException {
        Task_1 task = new Task_1();

        new Thread(() -> {
            while (true){
                synchronized (task){
                    try {
                        task.notify();
                        task.print("Ping");
                        task.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        Thread.sleep(100);

        new Thread(() -> {
            while (true){
                synchronized (task) {
                    try {
                        task.notify();
                        task.print("Pong");
                        task.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}

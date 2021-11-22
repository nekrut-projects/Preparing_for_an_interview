package lesson_3.task_2;

public class Main {
    public static void main(String[] args) {
        new Thread(new Client("Bob")).start();
        new Thread(new Client("Jhon")).start();
        new Thread(new Client("Nick")).start();
    }

}

package lesson_2;

import lesson_2.task_1.MyLinkedList;
import lesson_2.task_2.MyArrayList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        for (int i = 0; i < 1000; i++) {
            myLinkedList.add("test_" + i);
        }
        myLinkedList.add(777, "777_test_777");
        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.get(777));
        System.out.println(myLinkedList.getLast());


        MyArrayList<String> myArrayList = new MyArrayList<>();

        for (int i = 0; i < 10; i++) {
            myArrayList.add("test_" + (i + 1));
        }

        myArrayList.remove(6);

        for (int i = 0; i < myArrayList.getSize(); i++) {
            System.out.println(myArrayList.get(i));
        }
     }
}

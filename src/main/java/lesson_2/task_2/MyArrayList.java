package lesson_2.task_2;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyArrayList<T> {
    private final int DEFAULT_CAPACITY = 8;
    private final double FILL_FACTOR = 0.7;
    private final int RAISING_FACTOR = 2;

    private int capacity;
    private int size;
    private T[] array;

    public MyArrayList() {
        capacity = DEFAULT_CAPACITY;
        array = (T[]) new Object[capacity];
        size = 0;
    }

    public boolean add(T element){
        if (element == null){
            return false;
        }
        if (size > (int) capacity * FILL_FACTOR){
            array = createNewArray();
        }
        array[size] = element;
        size++;
        return true;
    }

    public T remove(int index){
        if (size == 0){
            throw new NoSuchElementException();
        }
        if (index > size || index < 0){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        T result = array[index];
        T[] newArray = (T[]) new Object[capacity];
        T[] partArray = Arrays.copyOfRange(array, 0, index);
        System.arraycopy(partArray, 0, newArray, 0, partArray.length);

        partArray = Arrays.copyOfRange(array, index + 1, array.length);
        System.arraycopy(partArray, 0, newArray, index, size - index);
        size--;
        array = newArray;
        return result;
    }

    public T get(int index){
        if (size == 0){
            throw new NoSuchElementException();
        }
        if (index > size || index < 0){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }

    public int getSize() {
        return size;
    }

    private T[] createNewArray(){
        capacity = capacity * RAISING_FACTOR;
        T[] newArray = (T[]) new Object[capacity];
        System.arraycopy(array, 0, newArray, 0 , size);
        return newArray;
    }

}

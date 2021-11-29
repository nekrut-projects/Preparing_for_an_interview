package lesson_2.task_1;

import java.util.NoSuchElementException;

public class MyLinkedList<T> {
    private int size;
    private Node<T> last;
    private Node<T> first;

    public int getSize() {
        return size;
    }

    public MyLinkedList() {
        this.size = 0;
    }

    public T getLast() {
        if (last == null){
            throw new NoSuchElementException();
        }
        return last.getContent();
    }

    public T getFirst(){
        if (first == null){
            throw new NoSuchElementException();
        }
        return first.getContent();
    }

    public T get(int index){
        if (size == 0){
            throw new NoSuchElementException();
        }
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        return findNode(index).getContent();
    }

    public boolean add(T element){
        if (size == 0){
            first = new Node<>(size, element);
            last = first;
        } else {
            Node<T> node = new Node<>(last.getIndex() + 1, element);
            node.setPreNode(last);
            last.setNextNode(node);
            last = node;
            last.setNextNode(first);
            first.setPreNode(last);
        }
        size++;
        return true;
    }

    public boolean add(int index, T element){
        Node<T> preNode = findNode(index - 1);
        Node<T> newNode = new Node<>(index, element);
        newNode.setNextNode(preNode.getNextNode());
        newNode.setPreNode(preNode);
        preNode.setNextNode(newNode);

        newNode.getNextNode().setPreNode(newNode);
        size++;
        reindex(newNode);
        return true;
    }

    public boolean contains(T element){
        if (element == null){
            return false;
        }
        Node<T> node = first;
        for (int i = 0; i < size; i++) {
            if (node.getContent().equals(element)){
                return true;
            }
        }
        return false;
    }

    public T remove(int index){
        Node<T> node = findNode(index);
        node.getPreNode().setNextNode(node.getNextNode());
        node.getNextNode().setPreNode(node.getPreNode());
        size--;
        reindex(node.getPreNode());
        return node.getContent();
    }

    private Node<T> findNode(int index){
        return index <= size / 2 ?
                directFind(index - 1) :
                reverseFind(index - 1);
    }

    private Node<T> directFind(int index){
        Node<T> node = first;
        for (int i = 0; i < size; i++) {
            if (node.getIndex() == index){
                return node;
            }
            node = node.getNextNode();
        }
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    private Node<T> reverseFind(int index){
        Node<T> node = last;
        for (int i = size - 1; i >= 0; i--) {
            if (i == index){
                return node;
            }
            node = node.getPreNode();
        }
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    private void reindex(Node<T> beginNode){
        for (int i = beginNode.getIndex(); i < size; i++) {
            beginNode.setIndex(i);
            beginNode = beginNode.getNextNode();
        }
    }

}

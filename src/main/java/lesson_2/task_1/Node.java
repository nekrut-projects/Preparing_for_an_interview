package lesson_2.task_1;

public class Node<T> {
    private int index;
    private T content;
    private Node<T> nextNode;
    private Node<T> preNode;

    public Node(int index, T content) {
        this.index = index;
        this.content = content;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public void setPreNode(Node<T> preNode) {
        this.preNode = preNode;
    }

    public int getIndex() {
        return index;
    }

    public T getContent() {
        return content;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public Node<T> getPreNode() {
        return preNode;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}

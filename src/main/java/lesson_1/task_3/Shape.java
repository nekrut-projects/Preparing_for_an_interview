package lesson_1.task_3;

public abstract class Shape {
    private String title;

    public String getTitle() {
        return title;
    }

    public Shape(String title) {
        this.title = title;
    }
     public abstract void getInfo();
}

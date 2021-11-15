package lesson_1.task_3;

public class Circle extends Shape{
    private int radius;

    public Circle(String title, int radius) {
        super(title);
        this.radius = radius;
    }

    public Circle(Circle circle) {
        super(circle.getTitle());
        this.radius = circle.getRadius();
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void getInfo() {
        System.out.printf("Фигура - %s, радиус = %d\n",getTitle(), getRadius());
    }

    public int getRadius() {
        return radius;
    }
}

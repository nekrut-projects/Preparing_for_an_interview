package lesson_1.task_3;

public class Triangle extends Shape {
    private int side;
    public Triangle(String title, int side) {
        super(title);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void getInfo() {
        System.out.printf("Фигура - %s, сторона = %d\n",getTitle(), getSide());
    }
}

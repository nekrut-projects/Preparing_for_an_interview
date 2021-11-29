package lesson_1.task_3;

public class Square extends Shape{
    private int side;

    public Square(String title, int side) {
        super(title);
        this.side = side;
    }

    public Square(Square square) {
        super(square.getTitle());
        this.side = square.getSide();
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

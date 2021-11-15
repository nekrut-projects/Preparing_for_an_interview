package lesson_1.task_3;

public class FactoryShape {
    static Shape getInstance(String title, int side) throws Exception {
        switch (title){
            case "круг":
                return new Circle(title, side);
            case "квадрат":
                return new Square(title, side);
            case "треугольник":
                return new Triangle(title, side);
        }
        throw new Exception();
    }
}

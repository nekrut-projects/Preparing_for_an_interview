package lesson_1.task_3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Shape> shapes = new LinkedList<>();
        shapes.addAll(Arrays.asList(
                FactoryShape.getInstance("круг", 5),
                FactoryShape.getInstance("квадрат", 8),
                FactoryShape.getInstance("круг", 10),
                FactoryShape.getInstance("треугольник", 12),
                FactoryShape.getInstance("круг", 3),
                FactoryShape.getInstance("квадрат", 6)));

        for (Shape s : shapes){
            s.getInfo();
        }

    }
}

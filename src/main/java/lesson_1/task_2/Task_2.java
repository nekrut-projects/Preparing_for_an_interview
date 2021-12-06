package lesson_1.task_2;

public class Task_2 {}

interface Moveable {
    void move();
}

interface Stopable {
    void stop();
}

//Хорошо бы добавить конструктор, для задания полей engine, color, name
//(на случай если в производных классах разработчик забудет о полях родителя, то конструктор напомнит)
abstract class Car {
    //Закрыть поле модификатором доступа private
    public Engine engine;
    private String color;
    private String name;

    //Данный метод следует сделать абстрактным, т.к. абстрактная машина начинающая движение - это странно.
    protected void start() {
        System.out.println("Car starting");
    }

    abstract void open();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

//Реализовать интерфейсы Moveable и Stopable в корневом классе Car
// или вообще сделать методы move() и stop() - абстрактными методами класса Car,
// т.к машины могут двигаться и останавливаться(их характерная черта),
// а судя по коду только грузовики могут останавливаться

class LightWeightCar extends Car implements Moveable{
    @Override
    void open() {
        System.out.println("Car is open");
    }
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}

// Классы наследуют, интерфейсы реализуют
// class Lorry extends Car  implements Moveable, Stopable
// Не реализован абстрактный метод родителя open() - класс будет абстрактным
class Lorry extends Car, Moveable, Stopable{
    public void move(){
        System.out.println("Car is moving");
    }
    public void stop(){
        System.out.println("Car is stop");
    }
}


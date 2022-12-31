package oopkonsepti;

public class main {
    public static void main(String[] args) {

        Car audi = new Car("Sports", "Audi", "red");
        audi.increaseSpeed(20);
        audi.printInfo();

        Car bmw = new Car("Sports" , "BMW" , "blue");
        bmw.increaseSpeed(10);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(5);
        bmw.decreaseSpeed(25);
        bmw.printInfo();

        Car mercedes = new Car("Corporate" , "Mercedes" , "black");
        mercedes.speed = 20;
        mercedes.printInfo();

    }
}

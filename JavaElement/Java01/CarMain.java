package JavaElement.Java01;

public class CarMain {
    public static void main(String[] args){
        Car myCar = new Car("赤" , 300);
        myCar.startEngine();
        myCar.accelerate(100);
        myCar.displayInfo();
        myCar.brake();
        myCar.displayInfo();

    }
}

package JavaElement.Java01;

public class CarMain {
    public static void main(String[] args){
        ElectricCar myCar = new ElectricCar("赤" , 300 ,10);
        myCar.startEngine();
        myCar.accelerate(100);
        myCar.displayInfo();
        myCar.brake();
        myCar.displayInfo();

    }
}

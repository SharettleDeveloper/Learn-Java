package JavaElement.Java01;

public class Car {
    String color;
    int speed;

    public Car(String color, int speed){
        this.color = color;
        this.speed = speed;
    }

    public void startEngine(){
        System.out.println("エンジンがスタートしました");
    }

    public void accelerate(int increase){
        speed += increase;
        System.out.println("スピードが" + speed + "に上がりました");
    }

    public void brake(){
        speed = 0;
        System.out.println("車が止まりました");
    }

    public void displayInfo(){
        System.out.println("車の色:" + color );
        System.out.println("現在のスピード" + speed);
    }
}

class ElectricCar extends Car{
    int batteryLevel;

    public ElectricCar(String color, int speed, int batteryLevel){
        super(color, speed);
        this.batteryLevel = batteryLevel;
    }

    public void chargeBattery(int charge){
        batteryLevel += charge;
        System.out.println("バッテリーを" + charge +"%充電しました。現在のバッテリー残量:" + batteryLevel + "%");
    }

    @Override
    public void startEngine(){
        if (batteryLevel > 0){
            System.out.println("電気エンジンがスタートしました");
        }else{
            System.out.println("バッテリーが不足しています。エンジンをスタートできません");
        }
    }
}

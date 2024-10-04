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



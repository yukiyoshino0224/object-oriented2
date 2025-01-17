package sample;

public class Car {
    private int speed;
    private String name;

    Car(){
    }

    Car(int speed, String name){
        this.speed = speed;
        this.name = name;
    }

    public void stepOnAccele(){
        speed = speed + 10;
        System.out.println("スピードが" + speed + "km/hに増えました");
    }

    public int getSpeed(){
        return this.speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void stepOnBrake(){
        speed = speed - 10;
        System.out.println("スピードが" + speed + "km/hに減りました");
    }
}

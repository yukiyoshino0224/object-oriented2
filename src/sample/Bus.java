package sample;

public class Bus extends Car {
    int price;


    @Override
    public void stepOnAccele(){
        setSpeed(getSpeed() + 10);
        System.out.println("スピードは" + getSpeed() + "km/hです");

        price += 30;
        System.out.println("料金は" + price + "円です");
    }

}

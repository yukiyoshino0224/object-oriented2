package sample;

public class Tax extends Car {
    int price;

    void payment(){
        System.out.println("料金を" + price + "円支払いました");
        price = 0;
    }

    @Override
    public void stepOnAccele(){
        setSpeed(getSpeed() + 10);
        System.out.println("スピードが" + getSpeed() + "km/hに増えました");
    
        price = price + 90;
        System.out.println("料金が" + price + "円に増えました");
    }
}

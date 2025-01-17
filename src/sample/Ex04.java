package sample;

public class Ex04 {

    public static void main(String[] args) {
        Car car = new Car();
        
        car.setSpeed(30);
        car.setName("エスティマ");

        System.out.println("現在の速度：" + car.getSpeed());
        System.out.println("名前：" + car.getName());
    }
}

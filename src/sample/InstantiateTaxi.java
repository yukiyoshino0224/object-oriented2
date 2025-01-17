package sample;

public class InstantiateTaxi {
   
    public static void main(String[] args) {
        System.out.println("車を走らせます");
        Car car = new Car();
        car.stepOnAccele();

        System.out.println("タクシーを走らせます");
        Tax tax = new Tax();
        tax.stepOnAccele();
    }

}
Users/yoshi/OneDrive/ドキュメント/introduction/object-oriented2g
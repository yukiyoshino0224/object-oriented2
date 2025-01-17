package sample;

public class InstantiateTV {

    public static void main(String[] args) {
        
        TV sonyTV = new TV();
        sonyTV.changeChannel();

        TV sharpTV = new TV();
        sharpTV.changeChannel();

        TV panasonicTV = new TV();
        panasonicTV.settChannel(12);
        panasonicTV.changeChannel();

    }

}

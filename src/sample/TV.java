package sample;

public class TV {
    private int channel;

    public void changeChannel(){
        if(channel <= 0 || 13 <= channel){
            System.out.println("チャンネルは1～12までの間で設定してください");
            return;
        }

        System.out.println(channel + "チャンネルに切り替わりました");
    }

    public int getChannel(){
        return this.channel;
    }

    public void settChannel(int channel){
        this.channel = channel;
    }

}

package homework.class실습;

public class Tv {
    private String color;
    private boolean power;
    private int channel;

    public Tv(){
        this.color = "black";
        this.power = false;
        this.channel = 0;
    }
    public void power(){
        this.power = !this.power;
    }
    public void channelUp(){
        this.channel++;
    }
    public void channelDown(){
        this.channel--;
    }
    public void print(){
        System.out.println("color :" + this.color + "    power :" + this.power + "    channel :" + this.channel);
    }
}

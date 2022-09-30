public class publicTranfer {
    public int num;
    public int fuel = 100;
    public int speed = 0;
    public int remaining;
    public int maxPassenger;
    public int pay;
    public int money;
    public int passenger;
    public String go = "款青";
    void now(){
        if(passenger == 0){
            System.out.println("款青 阂啊");
        }else {
            System.out.println("款青吝");
        }
    }
    void shift() {
        if (fuel < 10) {
            System.out.println("林蜡 鞘夸");
        }
    }
}


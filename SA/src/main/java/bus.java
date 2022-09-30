public class bus extends publicTranfer{
    bus(){
        this.maxPassenger = 30;
        this.remaining = 30;
        this.pay = 1000;
    }
    void stop(){
        riding(0);
        passenger = 0;
        maxPassenger = 30;
        remaining = 30;
        money = 0;
        System.out.println("차고지행");
    }
    void riding(int num) {
        if ((passenger + num) > maxPassenger) {
            remaining = 0;
            System.out.println("최대 승객 수 초과");
        } else {
            passenger += num;
            maxPassenger -= num;
            remaining -= num;
            money += pay * num;
        }
    }
}

public class taxi extends publicTranfer{
    String goal;                     //목적지
    public int distance = 1;                //기본거리
    public int totalDistance;
    public int surcharge;                  //추가요금
    public int x;                          //누적금액
    taxi(){
        this.maxPassenger = 4;
        this.pay = 3000;
    }
    void run(int num){
        if ((passenger + num) > maxPassenger) {
            remaining = 0;
            System.out.println("최대 승객 수 초과");
        } else {
            surcharge = (totalDistance - distance)*1000;
            money = pay + surcharge;
            passenger += num;
            maxPassenger -= num;
            remaining -= num;

        }
    }
    void arrival(){
        x += money;
        run(0);
        passenger = 0;
        maxPassenger = 4;
        remaining = 4;
        money =0;
        surcharge = 0;
        goal = "";
        totalDistance = 0;
        System.out.println("요금 결제");
    }
}
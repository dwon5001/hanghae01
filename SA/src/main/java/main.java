public class main {
    public static void main(String[] args) {
//        bus school = new bus();
//        school.num = 1234;
//        bus tayo = new bus();
//        tayo.num = 1111;
//        tayo.riding(2);
//        System.out.println(tayo.passenger);
//        System.out.println(tayo.maxPassenger);
//        System.out.println(tayo.money);
//        tayo.fuel -= 50;
//        System.out.println(tayo.fuel);
//        tayo.stop();
//        tayo.fuel +=10;
//        System.out.println(tayo.fuel);
//        System.out.println(tayo.go);
//        tayo.riding(45);
//        tayo.riding(5);
//        System.out.println(tayo.passenger);
//        System.out.println(tayo.maxPassenger);
//        System.out.println(tayo.money);
//        tayo.fuel -= 55;
//        System.out.println(tayo.fuel);
//        tayo.stop();
//        tayo.shift();

        taxi kakao = new taxi();
        kakao.num = 0000;
        taxi call = new taxi();
        call.num = 1212;
        call.goal = "서울역";
        call.totalDistance = 2;
        call.run(2);
        System.out.println(call.money);
        System.out.println(call.passenger);
        System.out.println(call.maxPassenger);
        System.out.println(call.pay);
        System.out.println(call.goal);
        System.out.println(call.totalDistance + "km");
        System.out.println(call.money);
        System.out.println(call.go);
        call.fuel -= 80;
        call.arrival();
        System.out.println(call.fuel);
        System.out.println(call.x);
        call.run(5);
        call.totalDistance += 12;
        call.run(3);
        call.goal ="구로디지털단지역";
        System.out.println(call.passenger);
        System.out.println(call.maxPassenger);
        System.out.println(call.pay);
        System.out.println(call.goal);
        System.out.println(call.totalDistance);
        System.out.println(call.money);
        call.fuel -= 20;
        call.arrival();
        System.out.println(call.fuel);
        call.now();
        System.out.println(call.x);
        call.shift();

    }
}
//    문제 3
//    while문과 Math.random() 메소드를 이용해서 2개의 주사위를 던졌을 때
//    나오는 눈을 (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고,
//    눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
//    눈의 합이 5가 되는 조합은 (1,4), (4,1), (2,3), (3,2)입니다.

    public class 문제3번 {
        public static void main(String[] args) {
            doDice();
        }
            static int dice() {
            return (int) (Math.random() * 6) + 1;
        }
        static void doDice() {
            int x, y;
            do {
                x = dice();
                y = dice();
                System.out.println(x + "," + y);
            } while (x + y != 5);
        }
    }

//    (int) (Math.random() * 6) + 1
//    Math.random() 은 0 ~ 1 미만의 난수를 반환한다
//    1~6의 값이 필요함 따라서 최소값은 1, 최대값은 6이 필요하다
//    (Math.random() * 최대값) 을 사용하여 최대값 자리에 6을 적용한다
//    (Math.random() * 6) 의 범위는 0 ~ 1 미만에 6을 곱하는 것이기 때문에
//    최소값은 1보다 작고 최대값도 6보다 작다(1미만이기 때문에)
//    (Math.random() * 6) + 1 을 통해 최소값과 최대값에 1을 더해준다
//    (Math.random() * 6) + 1 의 범위는 1~7 미만이다
//    (int) (Math.random() * 6) + 1 int를 사용하여 정수로 만들어 범위를 1~6 사이의 정수로 만든다.
//    while (x + y != 5); while문을 사용하여 x + y의 값이 5가 아니면 주사위를 던진다
//    x + y의 값이 5가 나온다면 멈춘다


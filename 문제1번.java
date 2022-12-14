//  문제 1번
//  다음 코드를 실행하면 출력 결과로 5를 기대했는데 4가 출력되었습니다.
//  어디에서 잘못 작성된 것일까요?

    public class 문제1번 {
        public static void main(String[] args) {
            int var1 = 5;  //double var1 = 5;
            int var2 = 2;  //double var2 = 2;
            double var3 = var1 / var2;
            int var4 = (int) (var3 * var2);
            System.out.println(var4);
        }
    }

//    var1과 var2의 데이터가 실수형이 아니라 정수형이기때문에 5가 아닌 4가 출력 된 것 이다
//    정수(int)를 실수(double)로 바꿔주면 된다.
//    double var3 = var1 / var2 를 계산하면 2.5이지만
//    var1과 var2가 정수(int) 이기때문에 값은 정수부분인 2만 남는다.
//    정수(int)를 실수(double)로 바꿔준다면 double var3 = var1 / var2의 값이 2.5되면서
//    출력 결과는 5가 나올 것 이다.

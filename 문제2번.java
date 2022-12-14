//    문제 2번
//    다음 코드를 실행했을 때 출력 결과는 무엇입니까? (증감연산자에 대해 알아보세요!)

    public class 문제2번 {
        public static void main(String[] args) {
            int x = 10;
            int y = 20;
            int z = (++x) + (y--);
            System.out.println(z);
        }
    }

//    여기서 z의 값은  (++x) + (y--)
//    ++x 의  의미는 연산을 하기전에 피연산자(x)의 값에  1을 증가 시킨다는 의미 이고
//    y--의 의미는 연산을 먼저 수행하고 나서 피연산자(y)의 값에 1을 감소 시킨다
//    (++x) + (y--) 연산의 순서는
//    1.(++x) x는 10 이고 1+10 값은 11
//    2.(++x) + (y--) y는 20이고 y--는 아직 연산 전이기 떄문에20이며 (++x) + (y--)는 11+20 값은 31
//    3.(y--) --> 연산이 수행되고 나서 y의 값을 1 감소시키기 때문에 20-1 값은 19
//    이기 때문에 z의 값은 31 이며
//    이 연산이후 x의 값은 11이 되고 y의 값은 19 가 된다

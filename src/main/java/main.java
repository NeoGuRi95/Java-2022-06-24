// 문제 : 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.

class Main {
    public static void main(String[] args) {

        // 구현시작
        자동차 a자동차1 = new 자동차(230);
        자동차 a자동차2 = new 자동차(210);
        // 구현끝

        a자동차1.run();
        // 출력 => 자동차가 최고속력 230km로 달립니다.

        a자동차2.run();
        // 출력 => 자동차가 최고속력 210km로 달립니다.
    }
}

class 자동차 {
    int max_speed;

    public 자동차(int max_speed) {
        this.max_speed = max_speed;
    }

    public void run() {
        System.out.println("자동차가 최고속력 " + this.max_speed + "km로 달립니다.");
    }
}
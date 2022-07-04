package oopExample;

public class 사람 {
    int number;
    String name;
    int age;
    사람 다음_사람;

    public 사람(int number, String name, int age, 사람 다음_사람) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.다음_사람 = 다음_사람;
    }

    public String 자기소개() {
        return "저는 " + number + "번, " + name + ", " + age + "살 입니다.";
    }
}

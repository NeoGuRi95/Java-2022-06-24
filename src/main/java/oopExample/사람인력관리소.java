package oopExample;

public class 사람인력관리소 {
    사람 처음_사람;
    int number = 0;

    public int getNumber() {
        return number;
    }

    public void add사람(String name, int age) {
        if (this.number == 0) {
            number += 1;
            처음_사람 = new 사람(number, name, age, null);
            return;
        }
        else {
            사람 현재_사람 = 처음_사람;
            while (true) {
                if (현재_사람.다음_사람 == null) {
                    number += 1;
                    현재_사람.다음_사람 = new 사람(number, name, age, null);
                    break;
                }
                현재_사람 = 현재_사람.다음_사람;
            }
        }
    }

    public 사람 get사람(int number) {
        사람 현재_사람 = 처음_사람;

        for (int i = 1; i < number; i++) {
            현재_사람 = 현재_사람.다음_사람;
        }

        return 현재_사람;
    }
}


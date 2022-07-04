package com.oopTest;

import oopExample.사람;
import oopExample.사람인력관리소;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OopTest {
    @Test
    public void insert_사람() {
        사람인력관리소 a사람인력관리소 = new 사람인력관리소();

        a사람인력관리소.add사람("홍길순", 33);
        a사람인력관리소.add사람("홍길동", 20);
        a사람인력관리소.add사람("임꺽정", 30);

        assertEquals(3, a사람인력관리소.getNumber());
    }

    @Test
    public void get_사람() {
        사람인력관리소 a사람인력관리소 = new 사람인력관리소();

        a사람인력관리소.add사람("홍길순", 33);
        a사람인력관리소.add사람("홍길동", 20);
        a사람인력관리소.add사람("임꺽정", 30);

        사람 a사람1 = a사람인력관리소.get사람(1);
        사람 a사람2 = a사람인력관리소.get사람(2);
        사람 a사람3 = a사람인력관리소.get사람(3);

        assertEquals("저는 1번, 홍길순, 33살 입니다.", a사람1.자기소개());
        assertEquals("저는 2번, 홍길동, 20살 입니다.", a사람2.자기소개());
        assertEquals("저는 3번, 임꺽정, 30살 입니다.", a사람3.자기소개());
    }
}

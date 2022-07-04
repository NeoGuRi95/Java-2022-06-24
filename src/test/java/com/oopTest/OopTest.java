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
}

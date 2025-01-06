package com.programmers.programmers.basic;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class Basic_1Test {

    @Test
    void solution1() {

        // 테스트 데이터: number = 12, n = 3, m = 4
        String input = "12\n3\n4\n"; // 사용자 입력 시 똑같은 값을 입력받을 것
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in); // System.in을 변경하여 자동으로 입력을 받도록 설정

        Basic_1 basic = new Basic_1();
        int result = basic.solution1(); // solution1 메서드 호출

        // 예상 결과는 1 (12는 3과 4의 배수)
        System.out.println("success 결과");
        assertEquals(1, result);
    }

    @Test
    public void testSolution1_Fail() {
        // 테스트 데이터: number = 15, n = 3, m = 4
        String input = "15\n3\n4\n"; // 사용자 입력 시 똑같은 값을 입력받을 것
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in); // System.in을 변경하여 자동으로 입력을 받도록 설정

        Basic_1 basic = new Basic_1();
        int result = basic.solution1(); // solution1 메서드 호출

        // 예상 결과는 0 (15는 3의 배수이지만 4의 배수는 아님)
        System.out.println("fail 결과");
        assertEquals(0, result);
    }
}
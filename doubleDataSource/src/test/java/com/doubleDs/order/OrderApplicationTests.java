package com.doubleDs.order;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class OrderApplicationTests {

    @Test
    void contextLoads() {
        List<String> moveOrderNoList=new ArrayList<>();
        moveOrderNoList.add("1234");
        moveOrderNoList.add("12342");
        moveOrderNoList.add("12344");
        String orderNoStr = moveOrderNoList.stream().collect(Collectors.joining("','"));
        System.out.println(orderNoStr);
    }

}

package com.junitproject1.junitproject1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Junitproject1ApplicationTests {

    calService calservice;

    @Mock
    AddService addservice;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void contextLoads() {
        System.out.println("hi everyone");
        calservice = new calService(addservice);
        int expected=3;
        Mockito.when(addservice.init(1, 2)).thenReturn(expected);

        int actual = calservice.test();

        Assertions.assertEquals(expected, actual);


    }

}

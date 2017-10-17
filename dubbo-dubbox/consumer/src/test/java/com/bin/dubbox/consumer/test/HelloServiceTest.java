package com.bin.dubbox.consumer.test;

import com.bin.dubbox.api.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by bin on 2017/3/19.
 */
@Slf4j
public class HelloServiceTest extends AbstractSpringBootTest{

    @Autowired
    private HelloService helloService;

    @Test
    public void testHello()
    {
        for (int i=0; i<10; i++)
        {
            String str = RandomStringUtils.random(10, true, false);
            System.out.println(str);
            helloService.hello(str);
        }
    }
}

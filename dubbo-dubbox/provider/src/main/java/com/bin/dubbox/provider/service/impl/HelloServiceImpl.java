package com.bin.dubbox.provider.service.impl;

import com.bin.dubbox.api.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created by bin on 2017/3/19.
 */
@Slf4j
@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public void hello(String name) {
        log.info("hello: {}", name);
    }
}

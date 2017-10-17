package com.bin.dubbo.consumer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by bin on 2017/3/19.
 */
@Configuration
@ImportResource({ "classpath:dubbo/*.xml" })
public class DubboConfig {
}

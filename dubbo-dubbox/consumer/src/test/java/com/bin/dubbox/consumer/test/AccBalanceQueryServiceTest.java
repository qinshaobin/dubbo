package com.bin.dubbox.consumer.test;

import com.bin.dubbox.api.request.AccBalanceQueryRequest;
import com.bin.dubbox.api.service.AccBalanceQueryService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by bin on 2017/3/19.
 */
@Slf4j
public class AccBalanceQueryServiceTest extends AbstractSpringBootTest{

    @Autowired
    private AccBalanceQueryService accBalanceQueryService;

    @Test
    public void testQueryAccBalance()
    {
        for (int i=0; i<5; i++)
        {
            AccBalanceQueryRequest request = AccBalanceQueryRequest
                    .builder()
                    .accCode(RandomStringUtils.random(10, true, false))
                    .build();
            System.out.println(ToStringBuilder.reflectionToString(accBalanceQueryService.queryAccBalance(request), ToStringStyle.MULTI_LINE_STYLE));
        }

    }
}

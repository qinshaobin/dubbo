package com.bin.dubbox.provider.service.impl;

import com.bin.dubbox.api.request.AccBalanceQueryRequest;
import com.bin.dubbox.api.response.AccBalanceQueryResponse;
import com.bin.dubbox.api.service.AccBalanceQueryService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Random;

/**
 * Created by bin on 2017/3/19.
 */
@Component
public class AccBalanceQueryServiceImpl implements AccBalanceQueryService {

    @Override
    public AccBalanceQueryResponse queryAccBalance(AccBalanceQueryRequest request) {
        AccBalanceQueryResponse response = AccBalanceQueryResponse
                .builder()
                .accCode(request.getAccCode())
                .curBalance(new BigDecimal(new Random().nextDouble()))
                .availBalance(new BigDecimal(new Random().nextDouble()))
                .build();
        return response;
    }
}

package com.bin.dubbo.api.service;

import com.bin.dubbo.api.request.AccBalanceQueryRequest;
import com.bin.dubbo.api.response.AccBalanceQueryResponse;

/**
 * Created by bin on 2017/3/19.
 */
public interface AccBalanceQueryService {

    AccBalanceQueryResponse queryAccBalance(AccBalanceQueryRequest request);
}

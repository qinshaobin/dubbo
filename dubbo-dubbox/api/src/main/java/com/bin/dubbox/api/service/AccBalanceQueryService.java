package com.bin.dubbox.api.service;

import com.bin.dubbox.api.request.AccBalanceQueryRequest;
import com.bin.dubbox.api.response.AccBalanceQueryResponse;

/**
 * Created by bin on 2017/3/19.
 */
public interface AccBalanceQueryService {

    AccBalanceQueryResponse queryAccBalance(AccBalanceQueryRequest request);
}

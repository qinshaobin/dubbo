package com.bin.dubbox.api.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by bin on 2017/3/19.
 */

@Getter
@Setter
@Builder
public class AccBalanceQueryResponse implements Serializable {

    private String accCode;

    private BigDecimal curBalance;

    private BigDecimal availBalance;
}

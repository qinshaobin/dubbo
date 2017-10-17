package com.bin.dubbo.api.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by bin on 2017/3/19.
 */
@Getter
@Setter
@Builder
public class AccBalanceQueryRequest implements Serializable{

    private String accCode;

}

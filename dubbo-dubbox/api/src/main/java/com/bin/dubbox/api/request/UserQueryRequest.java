package com.bin.dubbox.api.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by bin on 2017/3/19.
 */
@Getter
@Setter
public class UserQueryRequest implements Serializable{

    private String name;

}

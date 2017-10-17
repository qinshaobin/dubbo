package com.bin.dubbox.api.request;

import lombok.Getter;
import lombok.Setter;

import javax.ws.rs.QueryParam;
import java.io.Serializable;

/**
 * @author shaobin.qin
 * @Date 2017/04/01
 */
@Getter
@Setter
public class UserQueryRestRequest implements Serializable{

    private static final long serialVersionUID = 5775551726047623270L;

    @QueryParam("name")
    private String name;

}

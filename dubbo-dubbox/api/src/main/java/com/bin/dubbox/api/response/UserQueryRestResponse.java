package com.bin.dubbox.api.response;

import com.bin.dubbox.api.entity.User;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author shaobin.qin
 * @Date 2017/04/01
 */
@Getter
@Setter
public class UserQueryRestResponse implements Serializable{

	User user;

    private List<User> userList;

    private Map<String, User> userMap;

}

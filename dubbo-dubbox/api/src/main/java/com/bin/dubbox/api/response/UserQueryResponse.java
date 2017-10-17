package com.bin.dubbox.api.response;

import com.bin.dubbox.api.entity.User;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by bin on 2017/3/19.
 */
@Getter
@Setter
public class UserQueryResponse implements Serializable{

	User user;

    private List<User> userList;

    private Map<String, User> userMap;

}

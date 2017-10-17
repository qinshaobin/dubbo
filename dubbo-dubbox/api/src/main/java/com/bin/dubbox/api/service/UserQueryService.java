package com.bin.dubbox.api.service;

import com.bin.dubbox.api.request.UserQueryRequest;
import com.bin.dubbox.api.response.UserQueryResponse;

/**
 * @author shaobin.qin
 * @Date 2017/03/31
 */
public interface UserQueryService {

    UserQueryResponse queryUserByName(UserQueryRequest request);

    UserQueryResponse queryUserList(UserQueryRequest request);

    UserQueryResponse queryUserMap(UserQueryRequest request);

	UserQueryResponse queryUsers(UserQueryRequest request);
}

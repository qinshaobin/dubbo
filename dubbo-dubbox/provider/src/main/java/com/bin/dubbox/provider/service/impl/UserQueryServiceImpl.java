package com.bin.dubbox.provider.service.impl;

import com.bin.dubbox.api.request.UserQueryRequest;
import com.bin.dubbox.api.response.UserQueryResponse;
import com.bin.dubbox.api.service.UserQueryService;
import com.bin.dubbox.api.entity.User;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author shaobin.qin
 * @Date 2017/3/31
 */
@Slf4j
@Component
public class UserQueryServiceImpl implements UserQueryService{

	private List<User> userList = Lists.newArrayList();

	private Map<String, User> userMap = Maps.newHashMap();

	{
		userList = Lists.newArrayList();
		int num = 100;
		for (int i = 0; i < num; i++) {
			User user = new User();
			user.setId(i);
			user.setName(RandomStringUtils.random(10, true, false));
			user.setBirthDay(new Date(System.currentTimeMillis() + i));
			userList.add(user);
		}

		userMap = Maps.newHashMap();
		for (int i = 0; i < num; i++) {
			User user = new User();
			user.setId(i + num);
			user.setName(RandomStringUtils.random(10, true, false));
			user.setBirthDay(new Date(System.currentTimeMillis() + i));
			userMap.put(user.getName(), user);

		}
	}

	@Override
	public UserQueryResponse queryUserByName(UserQueryRequest request) {

		UserQueryResponse response = new UserQueryResponse();
		response.setUser(userMap.get(request.getName()));

		return response;
	}

	@Override
	public UserQueryResponse queryUserList(UserQueryRequest request) {

		UserQueryResponse response = new UserQueryResponse();
		response.setUserList(userList);

		return response;
	}

	@Override
	public UserQueryResponse queryUserMap(UserQueryRequest request) {

		UserQueryResponse response = new UserQueryResponse();
		response.setUserMap(userMap);

		return response;
	}

	@Override
	public UserQueryResponse queryUsers(UserQueryRequest request) {

		UserQueryResponse response = new UserQueryResponse();
		response.setUserList(userList);
		response.setUserMap(userMap);

		return response;
	}
}

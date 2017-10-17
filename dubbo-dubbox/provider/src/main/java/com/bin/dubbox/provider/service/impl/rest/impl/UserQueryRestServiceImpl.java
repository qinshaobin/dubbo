package com.bin.dubbox.provider.service.impl.rest.impl;

import com.bin.dubbox.api.response.UserQueryRestResponse;
import com.bin.dubbox.api.service.rest.UserQueryRestService;
import com.bin.dubbox.api.entity.User;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author shaobin.qin
 * @Date 2017/04/01
 */
@Component
public class UserQueryRestServiceImpl implements UserQueryRestService{

	private List<User> userList = Lists.newArrayList();

	private Map<String, User> userMap = Maps.newHashMap();

	{
		userList = Lists.newArrayList();
		int num = 100000;
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
	public UserQueryRestResponse queryUserByName(String name) {

		UserQueryRestResponse response = new UserQueryRestResponse();
		response.setUser(userMap.get(name));

		return response;
	}

	@Override
	public UserQueryRestResponse queryUserList() {

		UserQueryRestResponse response = new UserQueryRestResponse();
		response.setUserList(userList);

		return response;
	}

	@Override
	public UserQueryRestResponse queryUserMap() {

		UserQueryRestResponse response = new UserQueryRestResponse();
		response.setUserMap(userMap);

		return response;
	}

	@Override
	public UserQueryRestResponse queryUsers() {

		UserQueryRestResponse response = new UserQueryRestResponse();
		response.setUserList(userList);
		response.setUserMap(userMap);

		return response;
	}

	@Override
	public UserQueryRestResponse addUser(User user) {

		userList.add(user);
		UserQueryRestResponse response = new UserQueryRestResponse();
		response.setUser(user);

		return response;
	}
}

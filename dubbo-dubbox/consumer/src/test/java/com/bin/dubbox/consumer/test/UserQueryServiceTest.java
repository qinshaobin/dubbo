package com.bin.dubbox.consumer.test;

import com.bin.dubbox.api.request.UserQueryRequest;
import com.bin.dubbox.api.response.UserQueryResponse;
import com.bin.dubbox.api.service.UserQueryService;
import com.bin.dubbox.api.entity.User;
import com.google.common.io.Files;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/**
 * @Author shaobin.qin
 * @Date 2017/3/31
 */
public class UserQueryServiceTest extends AbstractSpringBootTest{

	private long currentTimeMillis;

	@Autowired
	private UserQueryService userQueryService;

	@Before
	public void begin()
	{
		currentTimeMillis = System.currentTimeMillis();
	}

	@After
	public void end()
	{
		System.out.println(System.currentTimeMillis() - currentTimeMillis);
	}

	@Test
	public void testQueryUser()
	{
		UserQueryRequest request = new UserQueryRequest();
		request.setName("qinshaobin1");

		System.out.println(userQueryService.queryUserByName(request));
	}

	@Test
	public void testQueryUserList()
	{
		List<User> userList = userQueryService.queryUserList(new UserQueryRequest()).getUserList();
		for (User user : userList) {
			System.out.println(user);
		}
	}

	@Test
	public void testQueryUserMap()
	{
		Map<String, User> userMap = userQueryService.queryUserMap(new UserQueryRequest()).getUserMap();
		for (User user : userMap.values()) {
			System.out.println(user);
		}
	}

	@Test
	public void testQueryUsers() throws Exception
	{
		UserQueryResponse userQueryResponse = userQueryService.queryUsers(new UserQueryRequest());

		List<User> userList = userQueryResponse.getUserList();
		for (User user : userList) {
			System.out.println(user);
		}

		Map<String, User> userMap = userQueryResponse.getUserMap();
		for (User user : userMap.values()) {
			System.out.println(user);
		}
	}

	@Test
	public void testSerialization() throws Exception
	{

		File file = new File("test.txt");
		if(file.exists())
			file.createNewFile();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 20; i++) {
			long startCurrentTimeMillis = System.currentTimeMillis();
			userQueryService.queryUsers(new UserQueryRequest());
			long time = System.currentTimeMillis() - startCurrentTimeMillis;
			sb.append(String.format("%-5s", time));
		}

		Files.append(sb.append("\r\n").toString(), file, Charset.forName("UTF-8"));

	}

}

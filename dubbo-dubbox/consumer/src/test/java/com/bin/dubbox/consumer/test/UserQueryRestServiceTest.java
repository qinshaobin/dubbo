package com.bin.dubbox.consumer.test;

import com.bin.dubbox.api.response.UserQueryRestResponse;
import com.bin.dubbox.api.service.rest.UserQueryRestService;
import com.bin.dubbox.api.entity.User;
import com.google.common.io.Files;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author shaobin.qin
 * @Date 2017/04/01
 */
public class UserQueryRestServiceTest extends AbstractSpringBootTest{

	private long currentTimeMillis;

	@Autowired
	private UserQueryRestService userQueryRestService;

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
		System.out.println(userQueryRestService.queryUserByName("qinshaobin1"));
	}

	@Test
	public void testQueryUserList()
	{
		List<User> userList = userQueryRestService.queryUserList().getUserList();
		for (User user : userList) {
			System.out.println(user);
		}
	}

	@Test
	public void testQueryUserMap()
	{
		Map<String, User> userMap = userQueryRestService.queryUserMap().getUserMap();
		for (User user : userMap.values()) {
			System.out.println(user);
		}
	}

	@Test
	public void testQueryUsers() throws Exception
	{
		UserQueryRestResponse userQueryResponse = userQueryRestService.queryUsers();

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
	public void testAddUser()
	{
		User user = new User();
		user.setId(1);
		user.setName("qinshaobin");
		user.setBirthDay(new Date());

		UserQueryRestResponse userQueryResponse = userQueryRestService.addUser(user);
		System.out.println(userQueryResponse.getUser());
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
			userQueryRestService.queryUsers();
			long time = System.currentTimeMillis() - startCurrentTimeMillis;
			sb.append(String.format("%-5s", time));
		}

		Files.append(sb.append("\r\n").toString(), file, Charset.forName("UTF-8"));

	}

}

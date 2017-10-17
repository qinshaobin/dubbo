package com.bin.dubbox.api.service.rest;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.bin.dubbox.api.entity.User;
import com.bin.dubbox.api.response.UserQueryRestResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author shaobin.qin
 * @Date 2017/04/01
 */
@Path("restServices/users")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public interface UserQueryRestService {

	@GET
	@Path("queryUserByName")
    UserQueryRestResponse queryUserByName(@QueryParam("name") String name);

	@GET
	@Path("queryUserList")
    UserQueryRestResponse queryUserList();

	@GET
	@Path("queryUserMap")
    UserQueryRestResponse queryUserMap();

	@GET
	@Path("queryUsers")
	UserQueryRestResponse queryUsers();

	@POST
	@Path("addUser")
	UserQueryRestResponse addUser(User user);
}

package com.bin.dubbox.api.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author shaobin.qin
 * @Date 2017/3/31
 */
@Getter
@Setter
@ToString
public class User implements Serializable{


	private static final long serialVersionUID = 1838050431401469448L;

	private int id;

	private String name;

	private Date birthDay;
}

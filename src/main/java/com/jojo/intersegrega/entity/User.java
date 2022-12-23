package com.jojo.intersegrega.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class User extends Entity{
	
	private String name;
	
	private LocalDateTime lastLogin;

}

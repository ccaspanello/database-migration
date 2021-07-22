package io.javamonkey.data.service.dao;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import java.io.Serializable;

@Data
@Entity
public class User implements Serializable
{
	@Id
	@Email
	private String username;
	private String password;
	
	protected User(){
		// No-arg constructor for JPA
	}
	
	public User(String username, String password){
		this.username = username;
		this.password = password;
	}
}

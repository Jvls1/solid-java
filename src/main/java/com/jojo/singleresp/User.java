package com.jojo.singleresp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//User entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;

    private String email;

    private String address;

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", address=" + address + "]";
	}

    
}
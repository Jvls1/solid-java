package com.jojo.singleresp;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UserRequestParser {

    public User parseUser(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(userJson, User.class);
    }
    
}

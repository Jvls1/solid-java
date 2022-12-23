package com.jojo.singleresp;

import java.io.IOException;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {

    private final UserPersistenceService persistenceService = new UserPersistenceService();
    
    //Create a new user
    public String createUser(String userJson) throws IOException {
        UserRequestParser parser = new UserRequestParser();
        User user = parser.parseUser(userJson);
        
        UserValidator validator = new UserValidator();
        boolean valid = validator.validateUser(user);

        if(!valid) {
            return "ERROR";
        }

        persistenceService.saverUser(user);
        
        return "SUCCESS";
    } 
    
}
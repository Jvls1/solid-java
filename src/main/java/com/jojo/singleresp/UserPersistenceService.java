package com.jojo.singleresp;

public class UserPersistenceService {

    private final Store store = new Store();
    
    public void saverUser(User user) {
        store.store(user);
    }
}

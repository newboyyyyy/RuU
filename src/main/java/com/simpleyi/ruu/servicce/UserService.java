package com.simpleyi.ruu.servicce;

import com.simpleyi.ruu.model.User;

public interface UserService {

    void save(User user);
    User login(String email , String password);
}

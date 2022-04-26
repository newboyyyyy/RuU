package com.simpleyi.ruu.servicce.impl;

import com.simpleyi.ruu.dao.UserRepository;
import com.simpleyi.ruu.model.User;
import com.simpleyi.ruu.servicce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User login(String email, String password) {
        User user = userRepository.findByEmailAndPassword(email, password);
        return user;
    }
}

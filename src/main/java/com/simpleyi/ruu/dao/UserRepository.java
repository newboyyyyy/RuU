package com.simpleyi.ruu.dao;

import com.simpleyi.ruu.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByEmailAndPassword(String email , String password) ;
}

package com.amit.springsercurity.domain;

import com.amit.springsercurity.database.entity.User;
import com.amit.springsercurity.database.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDomain {
    @Autowired
    private UserRepository userRepository;

    public User getUserByUserName(String userName){
        return userRepository.findByUserName(userName);
    }

    public void saveUser(User user){
        userRepository.save(user);
    }
}

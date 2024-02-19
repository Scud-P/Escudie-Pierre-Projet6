package com.oc.buddytest.test.service;

import com.oc.buddytest.test.controller.UserController;
import com.oc.buddytest.test.model.User;
import com.oc.buddytest.test.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    public UserRepository userRepository;

    public User saveUserWithBasicInfo(String firstName, String lastName, String email, String password) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPassword(password);
        return userRepository.save(user);
    }

    public User findByEmail(String email) {
        User user = userRepository.findByEmail(email);
        logger.info("User {} found for email {}", user, email);
        return user;
    }

    public User saveUser(User user) {
        User userToAdd = new User();
        userToAdd.setFirstName(user.getFirstName());
        userToAdd.setLastName(user.getLastName());
        userToAdd.setEmail(user.getEmail());
        userToAdd.setPassword(user.getPassword());
        return userRepository.save(userToAdd);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }


    @Transactional
    public User modifyUserInfo(User modifiedUser) {
        User existingUser = userRepository.findById(modifiedUser.getUserId()).orElse(null);
        if (existingUser != null) {
            logger.info("User {} {} found in DB", existingUser.getFirstName(), existingUser.getLastName());
            if (modifiedUser.getFirstName() != null) {
                existingUser.setFirstName(modifiedUser.getFirstName());
            }
            if (modifiedUser.getLastName() != null) {
                existingUser.setLastName(modifiedUser.getLastName());
            }
            if (modifiedUser.getEmail() != null) {
                existingUser.setEmail(modifiedUser.getEmail());
            }
            if (modifiedUser.getPassword() != null) {
                existingUser.setPassword(modifiedUser.getPassword());
            }
            logger.info("Profile modified to {} {} {}", existingUser.getFirstName(), existingUser.getLastName(), existingUser.getEmail());
            userRepository.saveAndFlush(existingUser);
            return existingUser;
        } else {
            return null;
        }
    }
}

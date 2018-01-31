package com.iqmsoft.service;

import java.util.List;
import java.util.Optional;

import com.iqmsoft.domain.User;

public interface UserService {

    boolean isUserExist(User user);

    User saveUser(User user);

    User findUserById(long id);

    List<User> findAllUsers();

    User updateUser(User user);

    void deleteUser(Long id);

    void deleteAllUsers();
}
package com.phonetracker.service;

import com.phonetracker.domain.User;
import com.phonetracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUser {
    public final UserRepository  userRepository;

    @Autowired
    public UserService (UserRepository Repo) {
        this.userRepository = Repo;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User read(Long aLong) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User delete(Long aLong) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

}

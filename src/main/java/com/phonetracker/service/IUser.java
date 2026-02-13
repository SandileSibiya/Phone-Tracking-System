package com.phonetracker.service;

import com.phonetracker.domain.User;

import java.util.List;

public interface IUser extends IService<User, Long> {
    List<User> getAllUsers();
}

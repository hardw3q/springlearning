package com.pixels.pixelsplus.service;

import com.pixels.pixelsplus.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User saveUser(User user);
    public User updateUser(User user);
    public void deleteUser(long id);

 }

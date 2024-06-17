package com.pixels.pixelsplus.service.impl;

import com.pixels.pixelsplus.model.User;
import com.pixels.pixelsplus.repository.UserRepository;
import com.pixels.pixelsplus.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;


    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }
}

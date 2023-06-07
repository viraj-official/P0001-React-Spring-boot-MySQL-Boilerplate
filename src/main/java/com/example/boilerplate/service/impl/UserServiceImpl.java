package com.example.boilerplate.service.impl;

import com.example.boilerplate.model.User;
import com.example.boilerplate.repository.UserRepository;
import com.example.boilerplate.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> viewAll() {
        return userRepository.findAll();
    }
}
package com.nouhoun.springboot.jwt.integration.service.impl;

import com.nouhoun.springboot.jwt.integration.domain.RandomCity;
import com.nouhoun.springboot.jwt.integration.domain.User;
import com.nouhoun.springboot.jwt.integration.repository.RandomCityRepository;
import com.nouhoun.springboot.jwt.integration.repository.UserLoginRepository;
import com.nouhoun.springboot.jwt.integration.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nydiarra on 07/05/17.
 */
@Service
public class GenericServiceImpl implements GenericService {
    @Autowired
    private UserLoginRepository userLoginRepository;

    @Autowired
    private RandomCityRepository randomCityRepository;

    @Override
    public User findByUsername(String username) {
        return userLoginRepository.findByUsername(username);
    }

    @Override
    public User save(User user) {
        return userLoginRepository.save(user);
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>) userLoginRepository.findAll();
    }

    @Override
    public List<RandomCity> findAllRandomCities() {
        return (List<RandomCity>)randomCityRepository.findAll();
    }
}

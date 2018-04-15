package com.hkumar.sso.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hkumar.sso.demo.domain.RandomCity;
import com.hkumar.sso.demo.domain.User;
import com.hkumar.sso.demo.repository.RandomCityRepository;
import com.hkumar.sso.demo.repository.UserRepository;
import com.hkumar.sso.demo.service.GenericService;

/**
 * Created by harishkumar
 */
@Service
public class GenericServiceImpl implements GenericService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RandomCityRepository randomCityRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>)userRepository.findAll();
    }

    @Override
    public List<RandomCity> findAllRandomCities() {
        return (List<RandomCity>)randomCityRepository.findAll();
    }
}

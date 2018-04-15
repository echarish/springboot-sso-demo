package com.hkumar.sso.demo.service;

import java.util.List;

import com.hkumar.sso.demo.domain.RandomCity;
import com.hkumar.sso.demo.domain.User;

/**
 * Created by harishkumar
 */
public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}

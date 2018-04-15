package com.hkumar.sso.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.hkumar.sso.demo.domain.User;

/**
 * Created by harishkumar
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}

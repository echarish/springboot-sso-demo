package com.hkumar.sso.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.hkumar.sso.demo.domain.Role;

/**
 * Created by harishkumar
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
}

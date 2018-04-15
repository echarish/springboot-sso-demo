package com.hkumar.sso.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.hkumar.sso.demo.domain.RandomCity;

/**
 * Created by harishkumar
 */
public interface RandomCityRepository extends CrudRepository<RandomCity, Long> {
}

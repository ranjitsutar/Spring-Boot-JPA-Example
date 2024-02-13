package com.ranjit.jpaexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ranjit.jpaexample.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

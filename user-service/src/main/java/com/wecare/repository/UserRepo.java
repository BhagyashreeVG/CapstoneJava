package com.wecare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wecare.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}

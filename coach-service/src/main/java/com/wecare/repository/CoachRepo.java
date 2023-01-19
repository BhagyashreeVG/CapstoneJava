package com.wecare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wecare.entity.Coach;

@Repository
public interface CoachRepo extends JpaRepository<Coach, Integer>{

}

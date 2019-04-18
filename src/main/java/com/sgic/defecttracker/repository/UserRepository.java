package com.sgic.defecttracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.defecttracker.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

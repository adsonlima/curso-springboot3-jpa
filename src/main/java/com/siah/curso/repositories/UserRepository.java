package com.siah.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siah.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

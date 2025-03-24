package com.projeto.proj1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.proj1.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

    
}
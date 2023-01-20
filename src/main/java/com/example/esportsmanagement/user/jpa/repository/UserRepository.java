package com.example.esportsmanagement.user.jpa.repository;

import com.example.esportsmanagement.user.jpa.data.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByEmail(final String email);
    Optional<UserEntity> findByUserName(final String userName);
}

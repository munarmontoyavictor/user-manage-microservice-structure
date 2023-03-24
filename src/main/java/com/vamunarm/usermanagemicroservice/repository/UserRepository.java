package com.vamunarm.usermanagemicroservice.repository;

import com.vamunarm.usermanagemicroservice.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByFullName(String fullName);
    UserEntity findByEmail(String email);

    List<UserEntity> findByFullNameContainingIgnoreCase(String name);
}

package com.aekcom.testbasic.repository;

import com.aekcom.testbasic.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {
}

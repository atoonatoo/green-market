package com.hotel.lodgingCommander.model.repository;

import com.hotel.lodgingCommander.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findBy();

    Boolean existsByEmail(String email);
}

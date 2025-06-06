package com.example.ApnaHotel.repo;

import com.example.ApnaHotel.dto.UserDTO;
import com.example.ApnaHotel.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);
}

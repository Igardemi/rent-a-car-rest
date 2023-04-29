package com.kings.rentacarrest.persistence.repository;

import com.kings.rentacarrest.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

package com.squarelemon.dao.interfaces;

import com.squarelemon.jdo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {
    @Query("from User")
    List<User> findAll();

}

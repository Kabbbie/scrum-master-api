package com.squarelemon.controller;

import com.squarelemon.dao.interfaces.UserRepo;
import com.squarelemon.jdo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController(value = "/repo")
public class MainController {
    @Autowired
    private UserRepo repo;

    @GetMapping("/findAll")
    public List<User> findAll() {
        return repo.findAll();
    }

    @PostMapping("/createNew")
    public void createNewUser() {
        User user = new User();
        user.setFirstName("hi");
        user.setLastName("mark");
        user.setEmploymentDate(LocalDate.now());
        user.setBirthDate(LocalDate.now().minusDays(45));
        repo.save(user);
    }
}

package com.projeto.proj1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.proj1.Repositories.UserRepository;
import com.projeto.proj1.entities.User;



@RestController
@RequestMapping(value= "/users")

public class proj1Controller {
    
    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll(){
        List<User> result =repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public User findAll(@PathVariable Long id){
        User result =repository.findById(id).get();
        return result;
    }
    @PostMapping
    public User insert(@RequestBody User user) {
        User result = repository.save(user);
        return result;
    }
    


}

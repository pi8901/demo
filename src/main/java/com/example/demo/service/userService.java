package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.api.model.user;

@Service
public class userService {

    private List<user> users = new ArrayList<user>();

    public userService() {
        user user1 = new user(1, "John", "wie", 23);
        user user2 = new user(2, "Doe", "wie", 23);
        user user3 = new user(3, "Verena", "schmidt", 23);
        user user4 = new user(4, "Doe", "wie", 23);
        user user5 = new user(5, "Jane", "wie", 23);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
    }

    public user getUser(Integer id) {
        for (user user: users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
    
}
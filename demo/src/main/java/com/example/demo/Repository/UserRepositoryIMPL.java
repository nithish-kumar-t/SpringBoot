package com.example.demo.Repository;

import com.example.demo.Models.User;
import com.example.demo.utils.Constants;
import com.sun.source.tree.BreakTree;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class UserRepositoryIMPL implements UserRepository {

    private List<User> userDataBase = new ArrayList<>();

    @Override
    public User createUser(User user) {
        User createdUser = new User(user.name, user.gender);
        userDataBase.add(createdUser);
        return createdUser;
    }

    @Override
    public User getUserById(UUID id) {
        User user = new User ("null", Constants.Gender.MALE);
        for (int i = 0; i < userDataBase.size(); i++){
            if (userDataBase.get(i).uuid == id) {
                user = userDataBase.get(i);
                break;
            }
        }
        return user;
    }
}
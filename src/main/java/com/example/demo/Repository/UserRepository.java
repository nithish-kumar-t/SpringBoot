package com.example.demo.Repository;
import com.example.demo.Models.User;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

public interface UserRepository {
    public User createUser(User user);
    public User getUserById (UUID id);

}
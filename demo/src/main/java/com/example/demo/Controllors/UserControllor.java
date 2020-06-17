package com.example.demo.Controllors;

import com.example.demo.Models.User;
import com.example.demo.Service.UserService;
import com.example.demo.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import static com.example.demo.utils.Constants.*;

@RestController
@RequestMapping(value = "/users", method = { RequestMethod.GET, RequestMethod.POST })
public class UserControllor {

    private UserService userService;

    @Autowired
    UserControllor (UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable(name="id") UUID id){
        return userService.getUser(id);
    }
}

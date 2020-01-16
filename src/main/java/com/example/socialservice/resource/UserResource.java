package com.example.socialservice.resource;

import com.example.socialservice.model.User;
import com.example.socialservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public User getUser(@RequestParam("userId") String userId) {
        return userService.getByUserId(userId);
    }

    @GetMapping("/all")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User saveUser(@Validated @RequestBody User user) {
        return userService.saveUser(user);
    }

    @PutMapping
    public User editUser(@RequestParam("userId") String userId, @RequestBody User user) {

        // check the validity of the userId first
        User oldUser = userService.getByUserId(userId);
        if(oldUser != null) {
            user.setId(userId);
            return userService.editUser(user);
        } else {
            return null;
        }

    }

    @DeleteMapping
    public void deleteUser(@RequestParam("userId") String userId) {
        userService.deleteUser(userId);
    }

}

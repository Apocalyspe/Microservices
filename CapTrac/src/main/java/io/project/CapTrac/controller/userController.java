package io.project.CapTrac.controller;

import io.project.CapTrac.model.UserList;
import io.project.CapTrac.model.Users;
import io.project.CapTrac.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@CrossOrigin(origins = "http://localhost:8085")
@RestController()
@RequestMapping("/users")
public class userController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/", produces = "application/json")
    public UserList userList() {
        return userService.getUsers();
    }

    @GetMapping(value = "/{userID}", produces = "application/json")
    public Optional<Users> getUser(@PathVariable Long userID) {
        return userService.getUser(userID);
    }

    @PostMapping(value = "/{userID}", consumes = {"application/json"})
    public Users addUser(@RequestBody Users users) {
        return userService.createUser(users);
    }

    @PutMapping(value = "/{userID}", consumes = {"application/json"})
    public Users updateUser(@RequestBody Users users) {
        return userService.createUser(users);
    }

    @GetMapping(value = "/check/{userID}")
    public Boolean checkUser(@PathVariable Long userID) {
        return userService.findUser(userID);
    }
}

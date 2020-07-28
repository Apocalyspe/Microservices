package io.project.CapTrac.controller;

import io.project.CapTrac.model.Users;
import io.project.CapTrac.service.UserService;
import org.hibernate.annotations.Fetch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:8085")
@RestController()
@RequestMapping("/users")
public class userController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/")
    public List<Users> userList(){
        return userService.getUsers();
    }

    @GetMapping(value = "/{userID}")
    public Optional<Users> getUser(@PathVariable Long userID){
        return userService.getUser(userID);
    }

    @PostMapping(value = "/{userID}", consumes = {"application/json"})
    public Users addUser(@RequestBody Users users){
        return userService.createUser(users);
    }

    @PutMapping(value = "/{userID}", consumes = {"application/json"})
    public Users updateUser(@RequestBody Users users){
        return userService.createUser(users);
    }

    @GetMapping(value = "/check/{userID}")
    public Boolean checkUser(@PathVariable Long userID) {
        return userService.findUser(userID);
    }
}

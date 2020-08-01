package io.project.CapTrac.controller;

import io.project.CapTrac.model.UserExpenseInfo;
import io.project.CapTrac.model.Users;
import io.project.CapTrac.service.UserExpenseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/users/expenses")
public class userExpController {

    @Autowired
    UserExpenseInfoService userExpenseInfoService;


    @GetMapping(value = "/")
    public List<UserExpenseInfo> getAllExpenses(){
        return userExpenseInfoService.getUsersInfo();
    }

    @GetMapping(value = "/{userID}")
    public List<UserExpenseInfo> getUserExpenses(@PathVariable String userID){
        return userExpenseInfoService.getUserInfo(userID);
    }

    @GetMapping(value = "/check/{userID}")
    public Boolean checkUserExpenses(@PathVariable Long userID){
        return userExpenseInfoService.checkExpenseInfo(userID);
    }


    @PostMapping(value = "/{userID}", consumes = {"application/json"})
    public UserExpenseInfo updateUserExpense(@RequestBody UserExpenseInfo userExpenseInfo){
        return userExpenseInfoService.updateUserInfo(userExpenseInfo);
    }

    //Adding comment

}

package io.project.CapTrac.controller;

import com.sun.istack.NotNull;
import io.project.CapTrac.model.UserExpenseInfo;
import io.project.CapTrac.model.UserExpenseInfoList;
import io.project.CapTrac.service.UserExpenseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/users/expenses")
public class userExpController {

    @Autowired
    UserExpenseInfoService userExpenseInfoService;


    @GetMapping(value = "/", produces = "application/json")
    public UserExpenseInfoList getAllExpenses() {
        return userExpenseInfoService.getUsersInfo();
    }

    @GetMapping(value = "/{userID}", produces = "application/json")
    public UserExpenseInfoList getUserExpenses(@PathVariable Long userID) {
        return userExpenseInfoService.getUserInfo(userID);
    }

    //Testing blah-user
    @NotNull
    @GetMapping(value = "/blah/{userID}", produces = "application/json")
    public UserExpenseInfoList blahExpenses(@PathVariable Long userID) {
        return userExpenseInfoService.getBlahInfo(userID);
    }


    @PostMapping(value = "/{userID}", consumes = {"application/json"})
    public UserExpenseInfo addUserExpenseInfo(@RequestBody UserExpenseInfo userExpenseInfo) {
        return userExpenseInfoService.updateUserInfo(userExpenseInfo);
    }

    @DeleteMapping(value = "/{transacid}", consumes = {"application/json"})
    public void deleteExpenseInfo(@PathVariable String transacid) {
        userExpenseInfoService.deleteUserExpenseInfo(transacid);
    }


}

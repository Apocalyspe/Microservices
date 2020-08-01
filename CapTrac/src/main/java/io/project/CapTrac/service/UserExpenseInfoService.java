package io.project.CapTrac.service;

import io.project.CapTrac.dao.UserExpenseInfoDao;
import io.project.CapTrac.model.UserExpenseInfo;
import io.project.CapTrac.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserExpenseInfoService {

    @Autowired
    UserExpenseInfoDao userExpenseInfoDao;

    //get all users
    public List<UserExpenseInfo> getUsersInfo(){
        return userExpenseInfoDao.findAll();
    }

    //get one user
    public List<UserExpenseInfo> getUserInfo(String userID){
        System.out.println(userID);
        return userExpenseInfoDao.findByUserID(userID);
    }

    //update user expense info
    public UserExpenseInfo updateUserInfo(UserExpenseInfo userExpenseInfo) {
        return userExpenseInfoDao.save(userExpenseInfo);
    }

    //delete user expense info
    public void deleteUserExpenseInfo(UserExpenseInfo userExpenseInfo) {
         userExpenseInfoDao.delete(userExpenseInfo);
    }

    //add user transactions
    public UserExpenseInfo addUserExpense(UserExpenseInfo userExpenseInfo){
        return userExpenseInfoDao.save(userExpenseInfo);
    }

    //Check if User transactions are present
    public Boolean checkExpenseInfo(Long userID) {
        if(userExpenseInfoDao.existsById(userID))
            return true;
        else
            return false;
    }
}

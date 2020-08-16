package io.project.CapTrac.service;

import io.project.CapTrac.dao.UserExpenseInfoDao;
import io.project.CapTrac.model.UserExpenseInfo;
import io.project.CapTrac.model.UserExpenseInfoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserExpenseInfoService {

    @Autowired
    UserExpenseInfoDao userExpenseInfoDao;

    //get all users
    public UserExpenseInfoList getUsersInfo() {
        UserExpenseInfoList userExpenseInfoList = new UserExpenseInfoList();
        userExpenseInfoList.setUserExpenseInfoList(userExpenseInfoDao.findAll());
        return userExpenseInfoList;
    }

    //get one user
    public UserExpenseInfoList getUserInfo(Long userID) {
        UserExpenseInfoList userExpenseInfoList = new UserExpenseInfoList();
        userExpenseInfoList.setUserExpenseInfoList(userExpenseInfoDao.findByUserID(userID));
        return userExpenseInfoList;
    }

    //Testing blah-user
    public UserExpenseInfoList getBlahInfo(Long userID) {
        UserExpenseInfoList userExpenseInfoList = new UserExpenseInfoList();
        userExpenseInfoList.setUserExpenseInfoList(userExpenseInfoDao.findByUserID(userID));
        return userExpenseInfoList;
    }

    //update user expense info
    public UserExpenseInfo updateUserInfo(UserExpenseInfo userExpenseInfo) {

        return userExpenseInfoDao.save(userExpenseInfo);
    }

    //delete user expense info
    public void deleteUserExpenseInfo(String transacid) {
        userExpenseInfoDao.deleteBytransacid(transacid);
    }


}

package io.project.CapTrac.service;

import io.project.CapTrac.dao.UserDao;
import io.project.CapTrac.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserDao userdao;


    Users users;

    //get all users
    public List<Users> getUsers(){
        return userdao.findAll();
    }

    //Save or update user
    public Users createUser(Users user){
        return userdao.save(user);
    }

    //get one user
    public Optional<Users> getUser(Long userID){
        return userdao.findById(userID);
    }

    public Boolean findUser(Long userID) {

        if(userdao.existsById(userID))
            return true;
        else
            return false;

    }
}

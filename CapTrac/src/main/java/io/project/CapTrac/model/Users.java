package io.project.CapTrac.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Users")
public class Users {


    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false, length = 10)
    private Long userID;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "EMAILID", unique = true)
    private String email;

    @OneToMany(mappedBy = "user")
    private List<UserExpenseInfo> expense;


    public long getUserID() {
        return userID;
    }
    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

package io.project.CapTrac.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name = "Users")
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

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<UserExpenseInfo> userExpenseInfos;

}

package io.project.CapTrac.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name = "UsersExpense")
public class UserExpenseInfo implements Serializable {

    @Column(name = "TRANSACID", nullable = false)
    @Id
    private String transacid;

    @Column(name = "EXPENSETYPE")
    private String ExpenseType;

    @Column(name = "AMOUNT")
    private float amount;

    @Column(name = "REMARK")
    private String Remark;

    @Column(name = "TIMESTAMP")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    private Timestamp timestamp;

    @Column(name = "TOTALEXP")
    private float totalexpense;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID", nullable = false)
    private Users user;


}

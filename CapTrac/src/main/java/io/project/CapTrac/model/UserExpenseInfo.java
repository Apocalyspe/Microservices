package io.project.CapTrac.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="UsersExpense")
public class UserExpenseInfo {

        @Column(name = "TRANSACID", nullable = false)
        @Id
        private String transacid;

        @Column(name = "EXPENSETYPE")
        private String ExpenseType;

        @Column(name = "AMOUNT")
        private float amount;

        @Column(name = "REMARK")
        private String Remark;

        @Column(name = "DATE")
        private Date date;

        @Column(name = "TOTALEXP")
        private float totalexpense;


        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "ID", nullable = false)
        private Users user;

        public Users getUser() {
        return user;
         }

        public void setUser(Users user) {
        this.user = user;
         }

        public String getTransacid() {
            return transacid;
        }
        public void setTransacid(String transacid) {
            this.transacid = transacid;
        }
        public String getExpenseType() {
            return ExpenseType;
        }
        public void setExpenseType(String expenseType) {
            ExpenseType = expenseType;
        }
        public float getAmount() {
            return amount;
        }
        public void setAmount(float amount) {
            this.amount = amount;
        }
        public String getRemark() {
            return Remark;
        }
        public void setRemark(String remark) {
            Remark = remark;
        }

        public Date getDate() {
            return date;
        }
        public void setDate(Date date) {
            this.date=date;
        }

        public float getTotalexpense() {
            return totalexpense;
        }
        public void setTotalexpense(float totalexpense) {
            this.totalexpense = totalexpense;
        }

        public long getUserID(){
            return user.getUserID();
        }

        public String getUserName(){
            return user.getUsername();
        }
    }

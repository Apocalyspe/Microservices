package io.project.CapTrac.dao;

import io.project.CapTrac.model.UserExpenseInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserExpenseInfoDao extends JpaRepository<UserExpenseInfo, Long> {

    @Query(value = "select * from captrac_db.users_expense b where b.id=?1", nativeQuery = true)
    List<UserExpenseInfo> findByUserID(String userID);

}

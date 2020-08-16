package io.project.CapTrac.dao;

import io.project.CapTrac.model.UserExpenseInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface UserExpenseInfoDao extends JpaRepository<UserExpenseInfo, Long> {

    @Query(value = "select * from captrac_db.users_expense b where b.id=?1 order by b.transacid", nativeQuery = true)
    List<UserExpenseInfo> findByUserID(Long userID);

    @Transactional
    @Modifying
    void deleteBytransacid(String transacid);
}

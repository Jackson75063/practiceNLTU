package com.example.sweater.Repository;

import com.example.sweater.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User,Long> {

    @Query(value = "SELECT * FROM user ORDER BY ID DESC LIMIT 1",nativeQuery = true)
    List<User> findLastUser();
}

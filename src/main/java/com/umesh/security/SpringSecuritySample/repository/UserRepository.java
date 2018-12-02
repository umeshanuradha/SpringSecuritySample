package com.umesh.security.SpringSecuritySample.repository;

import com.umesh.security.SpringSecuritySample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by umesh on 12/1/18.
 */
public interface UserRepository extends JpaRepository<User, Long>{


    List<User> findByUserName(String userName);




}

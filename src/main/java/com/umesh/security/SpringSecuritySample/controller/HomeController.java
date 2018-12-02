package com.umesh.security.SpringSecuritySample.controller;

import com.sun.security.auth.UserPrincipal;
import com.umesh.security.SpringSecuritySample.entity.User;
import com.umesh.security.SpringSecuritySample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

/**
 * Created by umesh on 11/28/18.
 */

@RestController
@RequestMapping(value = "/api")
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping(value = "/get")
    public String sayHellow(@AuthenticationPrincipal UserDetails userDetails){

       String userName =  userDetails.getUsername();

        Collection userDetailsInfo = userDetails.getAuthorities();
        userDetailsInfo.forEach(System.out::println);

        return "Sample app";
    }


    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping(value = "/test")
    public String testDb(){

        List<User> userList = userRepository.findAll();
        System.out.println(userList.size());

        return "testing db";
    }




}

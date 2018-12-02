package com.umesh.security.SpringSecuritySample.service;

import com.umesh.security.SpringSecuritySample.entity.CustomUserDetail;
import com.umesh.security.SpringSecuritySample.entity.User;
import com.umesh.security.SpringSecuritySample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by umesh on 12/1/18.
 */
@Service
public class  CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        List<User> userList = userRepository.findByUserName(username);

        if(!org.springframework.util.CollectionUtils.isEmpty(userList)){
            return new CustomUserDetail(userList.get(0));
        }else{
            throw new RuntimeException("User Not found");
        }

    }
}

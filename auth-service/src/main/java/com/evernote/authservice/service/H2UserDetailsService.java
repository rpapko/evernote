package com.evernote.authservice.service;

import com.evernote.authservice.domain.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class H2UserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

//		User user = repository.findByUsername(username);
//
//		if (user == null) {
//			throw new UsernameNotFoundException(username);
//		}

        User user = new User();
        user.setUsername("username");
        user.setPassword("password");

        return user;
    }

}

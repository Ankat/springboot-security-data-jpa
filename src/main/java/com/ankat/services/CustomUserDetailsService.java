package com.ankat.services;

import com.ankat.entity.User;
import com.ankat.model.CustomUserDetail;
import com.ankat.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service(value = "customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String usrName) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsrName(usrName);
        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + usrName));
        return user.map(CustomUserDetail::new).get();
    }
}

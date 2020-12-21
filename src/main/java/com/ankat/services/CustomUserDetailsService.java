package com.ankat.services;

import com.ankat.model.CustomUserDetails;
import com.ankat.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service(value = "customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String usrUsername) throws UsernameNotFoundException {
        return userRepository.findByUsrUsername(usrUsername).map(CustomUserDetails::new).orElseThrow(() -> new UsernameNotFoundException("No Found "+usrUsername));
    }
}

package com.myhttp.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
    public static String passwordEncoder(String curPassword){
        String  password = new BCryptPasswordEncoder().encode(curPassword);
        return password;
    }
}

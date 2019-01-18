package com.myhttp.beetl;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestPasswordEncoder {
    public static void main(String []args){
        String  password = new BCryptPasswordEncoder().encode("123");
        System.out.println(password);
    }
}

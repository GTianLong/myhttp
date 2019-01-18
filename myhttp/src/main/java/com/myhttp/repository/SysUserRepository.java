package com.myhttp.repository;

import com.myhttp.model.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUser, Long> {
    SysUser findByUsername(String username);
//    SysUser insertUser();
}

package com.hchw.management.repository;

import com.hchw.management.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsername(String username);
}


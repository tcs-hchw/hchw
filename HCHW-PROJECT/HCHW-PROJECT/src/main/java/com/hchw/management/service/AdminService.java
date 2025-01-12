package com.hchw.management.service;

import com.hchw.management.entity.Admin;
import com.hchw.management.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public Admin getAdminByUsername(String username) {
        return adminRepository.findByUsername(username);
    }
}

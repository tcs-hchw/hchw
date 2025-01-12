package com.hchw.management.service;

import com.hchw.management.entity.Donor;
import com.hchw.management.repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonorService {
    @Autowired
    private DonorRepository donorRepository;

    public List<Donor> getAllDonors() {
        return donorRepository.findAll();
    }

    public Donor addDonor(Donor donor) {
        return donorRepository.save(donor);
    }
}


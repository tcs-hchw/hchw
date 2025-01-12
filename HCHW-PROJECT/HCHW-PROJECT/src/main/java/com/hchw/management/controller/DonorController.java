package com.hchw.management.controller;

import com.hchw.management.entity.Donor;
import com.hchw.management.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/donorsdetails")
public class DonorController {
    @Autowired
    private DonorService donorService;

    @GetMapping
    public List<Donor> getAllDonors() {
        return donorService.getAllDonors();
    }

    @PostMapping("/add")
    public Donor addDonor(@RequestBody Donor donor) {
        return donorService.addDonor(donor);
    }
}
